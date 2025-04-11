package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuandiaochaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuandiaochaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuandiaochaView;


/**
 * 问卷调查
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface WenjuandiaochaService extends IService<WenjuandiaochaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuandiaochaVO> selectListVO(Wrapper<WenjuandiaochaEntity> wrapper);
   	
   	WenjuandiaochaVO selectVO(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
   	
   	List<WenjuandiaochaView> selectListView(Wrapper<WenjuandiaochaEntity> wrapper);
   	
   	WenjuandiaochaView selectView(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuandiaochaEntity> wrapper);
   	

}

