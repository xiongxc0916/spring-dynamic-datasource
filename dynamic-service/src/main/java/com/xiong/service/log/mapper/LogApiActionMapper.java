package com.xiong.service.log.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiong.service.log.entity.LogApiAction;
import org.apache.ibatis.annotations.Mapper;

/**
* @Description:  接口调用日志
* @author: xxc 
* @Date: 1.0.0 2021-09-30
*/
@Mapper
public interface LogApiActionMapper extends BaseMapper<LogApiAction> {
	
}