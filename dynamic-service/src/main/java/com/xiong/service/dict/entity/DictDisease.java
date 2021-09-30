package com.xiong.service.dict.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * 疾病字典
 *
 * @author xxc 
 * @since 1.0.0 2021-09-30
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("dict_disease")
public class DictDisease extends Model<DictDisease> {
	private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Integer id;
    /**
     * 疾病编码
     */
	private String code;
    /**
     * 疾病名称
     */
	private String name;
    /**
     * 更新时间
     */
	private Date updateTime;
    /**
     * 更新用户
     */
	private String updateUser;
}