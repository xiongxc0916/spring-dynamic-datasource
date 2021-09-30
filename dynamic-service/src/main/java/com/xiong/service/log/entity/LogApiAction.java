package com.xiong.service.log.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * 接口调用日志
 *
 * @author xxc 
 * @since 1.0.0 2021-09-30
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("log_api_action")
public class LogApiAction extends Model<LogApiAction> {
	private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Integer id;
    /**
     * 接口地址
     */
	private String action;
    /**
     * 调用时间
     */
	private Date createTime;
    /**
     * 调用人
     */
	private String createUser;
}