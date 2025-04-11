package com.dao;

import com.entity.WenjuandajuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuandajuanVO;
import com.entity.view.WenjuandajuanView;


/**
 * 问卷答卷
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface WenjuandajuanDao extends BaseMapper<WenjuandajuanEntity> {
	
	List<WenjuandajuanVO> selectListVO(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
	
	WenjuandajuanVO selectVO(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
	
	List<WenjuandajuanView> selectListView(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);

	List<WenjuandajuanView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
	
	WenjuandajuanView selectView(@Param("ew") Wrapper<WenjuandajuanEntity> wrapper);
	

}
