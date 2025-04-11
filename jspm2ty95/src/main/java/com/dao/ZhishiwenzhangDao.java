package com.dao;

import com.entity.ZhishiwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishiwenzhangVO;
import com.entity.view.ZhishiwenzhangView;


/**
 * 知识文章
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface ZhishiwenzhangDao extends BaseMapper<ZhishiwenzhangEntity> {
	
	List<ZhishiwenzhangVO> selectListVO(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
	
	ZhishiwenzhangVO selectVO(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
	
	List<ZhishiwenzhangView> selectListView(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);

	List<ZhishiwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
	
	ZhishiwenzhangView selectView(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
	

}
