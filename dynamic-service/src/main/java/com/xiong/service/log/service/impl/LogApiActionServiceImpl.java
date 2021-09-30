package com.xiong.service.log.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.service.log.entity.LogApiAction;
import com.xiong.service.log.mapper.LogApiActionMapper;
import com.xiong.service.log.service.LogApiActionService;
import org.springframework.stereotype.Service;

/**
 * @Description:  接口调用日志
 * @author: xxc 
 * @Date: 1.0.0 2021-09-30
 */
@Service
public class LogApiActionServiceImpl extends ServiceImpl<LogApiActionMapper, LogApiAction> implements LogApiActionService {

}