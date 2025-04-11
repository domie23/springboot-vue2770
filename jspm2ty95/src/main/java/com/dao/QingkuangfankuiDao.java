package com.dao;

import com.entity.QingkuangfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingkuangfankuiVO;
import com.entity.view.QingkuangfankuiView;


/**
 * 情况反馈
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface QingkuangfankuiDao extends BaseMapper<QingkuangfankuiEntity> {
	
	List<QingkuangfankuiVO> selectListVO(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
	
	QingkuangfankuiVO selectVO(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
	
	List<QingkuangfankuiView> selectListView(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);

	List<QingkuangfankuiView> selectListView(Pagination page,@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
	
	QingkuangfankuiView selectView(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
	

}
