package com.xiong.service.his.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * 医院信息表
 *
 * @author xxc 
 * @since 1.0.0 2021-09-30
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("his_hospital")
public class HisHospital extends Model<HisHospital> {
	private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Integer id;
    /**
     * 医院编码
     */
	private String hospitalCode;
    /**
     * 医院名字
     */
	private String hospitalName;
    /**
     * 更新时间
     */
	private Date updateTime;
    /**
     * 更新用户
     */
	private String updateUser;
}