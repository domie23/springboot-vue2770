package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuandajuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuandajuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuandajuanView;


/**
 * 问卷答卷
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface WenjuandajuanService extends IService<WenjuandajuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuandajuanVO> selectListVO(Wrapper<WenjuandajuanEntity> wrapper);
   	
   	WenjuandajuanVO selectVO(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
   	
   	List<WenjuandajuanView> selectListView(Wrapper<WenjuandajuanEntity> wrapper);
   	
   	WenjuandajuanView selectView(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuandajuanEntity> wrapper);
   	

}

