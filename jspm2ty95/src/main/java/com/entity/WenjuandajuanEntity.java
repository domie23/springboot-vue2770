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
 * 问卷答卷
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("wenjuandajuan")
public class WenjuandajuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenjuandajuanEntity() {
		
	}
	
	public WenjuandajuanEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 问题一
	 */
					
	private String wentiyi;
	
	/**
	 * 回答一
	 */
					
	private String huidayi;
	
	/**
	 * 问题二
	 */
					
	private String wentier;
	
	/**
	 * 回答二
	 */
					
	private String huidaer;
	
	/**
	 * 问题三
	 */
					
	private String wentisan;
	
	/**
	 * 回答三
	 */
					
	private String huidasan;
	
	/**
	 * 问题四
	 */
					
	private String wentisi;
	
	/**
	 * 回答四
	 */
					
	private String huidasi;
	
	/**
	 * 答卷时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dajuanshijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
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
	 * 设置：回答一
	 */
	public void setHuidayi(String huidayi) {
		this.huidayi = huidayi;
	}
	/**
	 * 获取：回答一
	 */
	public String getHuidayi() {
		return huidayi;
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
	 * 设置：回答二
	 */
	public void setHuidaer(String huidaer) {
		this.huidaer = huidaer;
	}
	/**
	 * 获取：回答二
	 */
	public String getHuidaer() {
		return huidaer;
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
	 * 设置：回答三
	 */
	public void setHuidasan(String huidasan) {
		this.huidasan = huidasan;
	}
	/**
	 * 获取：回答三
	 */
	public String getHuidasan() {
		return huidasan;
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
	 * 设置：回答四
	 */
	public void setHuidasi(String huidasi) {
		this.huidasi = huidasi;
	}
	/**
	 * 获取：回答四
	 */
	public String getHuidasi() {
		return huidasi;
	}
	/**
	 * 设置：答卷时间
	 */
	public void setDajuanshijian(Date dajuanshijian) {
		this.dajuanshijian = dajuanshijian;
	}
	/**
	 * 获取：答卷时间
	 */
	public Date getDajuanshijian() {
		return dajuanshijian;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}

}
