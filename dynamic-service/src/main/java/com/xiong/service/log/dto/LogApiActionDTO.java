package com.xiong.service.log.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @Description:  接口调用日志
 * @author: xxc 
 * @Date: 1.0.0 2021-09-30
 */
@Data
@ApiModel(value = "接口调用日志")
public class LogApiActionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键ID")
	private Integer id;

	@ApiModelProperty(value = "接口地址")
	private String action;

	@ApiModelProperty(value = "调用时间")
	private Date createTime;

	@ApiModelProperty(value = "调用人")
	private String createUser;


}