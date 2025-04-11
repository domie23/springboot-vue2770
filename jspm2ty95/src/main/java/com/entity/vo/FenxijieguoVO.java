package com.entity.vo;

import com.entity.FenxijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 分析结果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public class FenxijieguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	/**
	 * 评分
	 */
	
	private String pingfen;
		
	/**
	 * 等级
	 */
	
	private String dengji;
		
	/**
	 * 分析
	 */
	
	private String fenxi;
		
	/**
	 * 操作时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caozuoshijian;
				
	
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
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setPingfen(String pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public String getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：等级
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：分析
	 */
	 
	public void setFenxi(String fenxi) {
		this.fenxi = fenxi;
	}
	
	/**
	 * 获取：分析
	 */
	public String getFenxi() {
		return fenxi;
	}
				
	
	/**
	 * 设置：操作时间
	 */
	 
	public void setCaozuoshijian(Date caozuoshijian) {
		this.caozuoshijian = caozuoshijian;
	}
	
	/**
	 * 获取：操作时间
	 */
	public Date getCaozuoshijian() {
		return caozuoshijian;
	}
			
}
