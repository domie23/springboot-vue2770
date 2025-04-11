package com.dao;

import com.entity.FenxijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxijieguoVO;
import com.entity.view.FenxijieguoView;


/**
 * 分析结果
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface FenxijieguoDao extends BaseMapper<FenxijieguoEntity> {
	
	List<FenxijieguoVO> selectListVO(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
	
	FenxijieguoVO selectVO(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
	
	List<FenxijieguoView> selectListView(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);

	List<FenxijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
	
	FenxijieguoView selectView(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
	

}
