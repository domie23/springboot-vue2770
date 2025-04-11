package com.entity.view;

import com.entity.DiscusszhishiwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识文章评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("discusszhishiwenzhang")
public class DiscusszhishiwenzhangView  extends DiscusszhishiwenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhishiwenzhangView(){
	}
 
 	public DiscusszhishiwenzhangView(DiscusszhishiwenzhangEntity discusszhishiwenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhishiwenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
