package com.xiong.service.dict.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @Description:  疾病字典
 * @author: xxc 
 * @Date: 1.0.0 2021-09-30
 */
@Data
@ApiModel(value = "疾病字典")
public class DictDiseaseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键ID")
	private Integer id;

	@ApiModelProperty(value = "疾病编码")
	private String code;

	@ApiModelProperty(value = "疾病名称")
	private String name;

	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	@ApiModelProperty(value = "更新用户")
	private String updateUser;


}