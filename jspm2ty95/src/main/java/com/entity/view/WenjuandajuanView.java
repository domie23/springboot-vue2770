package com.entity.view;

import com.entity.WenjuandajuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问卷答卷
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("wenjuandajuan")
public class WenjuandajuanView  extends WenjuandajuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenjuandajuanView(){
	}
 
 	public WenjuandajuanView(WenjuandajuanEntity wenjuandajuanEntity){
 	try {
			BeanUtils.copyProperties(this, wenjuandajuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
