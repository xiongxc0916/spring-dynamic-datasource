package com.xiong.service.his.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @Description:  医院信息表
 * @author: xxc 
 * @Date: 1.0.0 2021-09-30
 */
@Data
@ApiModel(value = "医院信息表")
public class HisHospitalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键ID")
	private Integer id;

	@ApiModelProperty(value = "医院编码")
	private String hospitalCode;

	@ApiModelProperty(value = "医院名字")
	private String hospitalName;

	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	@ApiModelProperty(value = "更新用户")
	private String updateUser;


}