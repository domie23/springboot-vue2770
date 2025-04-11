package com.entity.view;

import com.entity.QingkuangfankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 情况反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("qingkuangfankui")
public class QingkuangfankuiView  extends QingkuangfankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QingkuangfankuiView(){
	}
 
 	public QingkuangfankuiView(QingkuangfankuiEntity qingkuangfankuiEntity){
 	try {
			BeanUtils.copyProperties(this, qingkuangfankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
