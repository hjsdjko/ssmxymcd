package com.entity.model;

import com.entity.DianfeitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 电费统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public class DianfeitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
