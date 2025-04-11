package com.dao;

import com.entity.DiscusszhishiwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhishiwenzhangVO;
import com.entity.view.DiscusszhishiwenzhangView;


/**
 * 知识文章评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface DiscusszhishiwenzhangDao extends BaseMapper<DiscusszhishiwenzhangEntity> {
	
	List<DiscusszhishiwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
	
	DiscusszhishiwenzhangVO selectVO(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
	
	List<DiscusszhishiwenzhangView> selectListView(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);

	List<DiscusszhishiwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
	
	DiscusszhishiwenzhangView selectView(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
	

}
