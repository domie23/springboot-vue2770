package com.entity.view;

import com.entity.WenjuandiaochaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问卷调查
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("wenjuandiaocha")
public class WenjuandiaochaView  extends WenjuandiaochaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenjuandiaochaView(){
	}
 
 	public WenjuandiaochaView(WenjuandiaochaEntity wenjuandiaochaEntity){
 	try {
			BeanUtils.copyProperties(this, wenjuandiaochaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
