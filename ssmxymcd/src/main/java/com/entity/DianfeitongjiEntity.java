package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电费统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
@TableName("dianfeitongji")
public class DianfeitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianfeitongjiEntity() {
		
	}
	
	public DianfeitongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 电费统计
	 */
					
	private String dianfeitongji;
	
	/**
	 * 缴纳人数
	 */
					
	private Integer jiaonarenshu;
	
	/**
	 * 总金额
	 */
					
	private Integer zongjine;
	
	/**
	 * 登记人
	 */
					
	private String dengjiren;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：电费统计
	 */
	public void setDianfeitongji(String dianfeitongji) {
		this.dianfeitongji = dianfeitongji;
	}
	/**
	 * 获取：电费统计
	 */
	public String getDianfeitongji() {
		return dianfeitongji;
	}
	/**
	 * 设置：缴纳人数
	 */
	public void setJiaonarenshu(Integer jiaonarenshu) {
		this.jiaonarenshu = jiaonarenshu;
	}
	/**
	 * 获取：缴纳人数
	 */
	public Integer getJiaonarenshu() {
		return jiaonarenshu;
	}
	/**
	 * 设置：总金额
	 */
	public void setZongjine(Integer zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：总金额
	 */
	public Integer getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：登记人
	 */
	public void setDengjiren(String dengjiren) {
		this.dengjiren = dengjiren;
	}
	/**
	 * 获取：登记人
	 */
	public String getDengjiren() {
		return dengjiren;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
