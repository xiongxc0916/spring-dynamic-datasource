package com.xiong.commons.datasources.aspect;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.xiong.commons.datasources.DataSourceNames;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 多数据源，切面处理类
 *
 */
@Aspect
@Component
@Order(0)
@Lazy(false)
@Slf4j
public class DataSourceLogAspect {

    @Pointcut("execution(* com.xiong.service.log.mapper..*.*(..))")
    public void dataSourceLogPointCut() {
    }

    /**
     * 在切点方法之前执行
     *
     * @param
     */
    @Before("dataSourceLogPointCut()")
    private void process(JoinPoint point) {
        Signature signature = point.getSignature();
        Class clz = signature.getDeclaringType();
        DS ds = (DS) clz.getAnnotation(DS.class);
        if (ds == null && DynamicDataSourceContextHolder.peek() == null) {
            DynamicDataSourceContextHolder.push(DataSourceNames.LOG);
        }
    }

    @After("dataSourceLogPointCut()")
    public void afterAdvice() {
        DynamicDataSourceContextHolder.clear();
    }
}
