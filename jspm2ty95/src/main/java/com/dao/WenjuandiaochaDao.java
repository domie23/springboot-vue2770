package com.dao;

import com.entity.WenjuandiaochaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuandiaochaVO;
import com.entity.view.WenjuandiaochaView;


/**
 * 问卷调查
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface WenjuandiaochaDao extends BaseMapper<WenjuandiaochaEntity> {
	
	List<WenjuandiaochaVO> selectListVO(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	WenjuandiaochaVO selectVO(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	List<WenjuandiaochaView> selectListView(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);

	List<WenjuandiaochaView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	WenjuandiaochaView selectView(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	

}
