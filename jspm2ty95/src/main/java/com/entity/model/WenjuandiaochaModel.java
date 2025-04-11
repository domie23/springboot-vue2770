package com.entity.model;

import com.entity.WenjuandiaochaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 问卷调查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public class WenjuandiaochaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 问题一
	 */
	
	private String wentiyi;
		
	/**
	 * 问题二
	 */
	
	private String wentier;
		
	/**
	 * 问题三
	 */
	
	private String wentisan;
		
	/**
	 * 问题四
	 */
	
	private String wentisi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：问题一
	 */
	 
	public void setWentiyi(String wentiyi) {
		this.wentiyi = wentiyi;
	}
	
	/**
	 * 获取：问题一
	 */
	public String getWentiyi() {
		return wentiyi;
	}
				
	
	/**
	 * 设置：问题二
	 */
	 
	public void setWentier(String wentier) {
		this.wentier = wentier;
	}
	
	/**
	 * 获取：问题二
	 */
	public String getWentier() {
		return wentier;
	}
				
	
	/**
	 * 设置：问题三
	 */
	 
	public void setWentisan(String wentisan) {
		this.wentisan = wentisan;
	}
	
	/**
	 * 获取：问题三
	 */
	public String getWentisan() {
		return wentisan;
	}
				
	
	/**
	 * 设置：问题四
	 */
	 
	public void setWentisi(String wentisi) {
		this.wentisi = wentisi;
	}
	
	/**
	 * 获取：问题四
	 */
	public String getWentisi() {
		return wentisi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
