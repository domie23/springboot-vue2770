package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhishiwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhishiwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhishiwenzhangView;


/**
 * 知识文章评论表
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface DiscusszhishiwenzhangService extends IService<DiscusszhishiwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhishiwenzhangVO> selectListVO(Wrapper<DiscusszhishiwenzhangEntity> wrapper);
   	
   	DiscusszhishiwenzhangVO selectVO(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
   	
   	List<DiscusszhishiwenzhangView> selectListView(Wrapper<DiscusszhishiwenzhangEntity> wrapper);
   	
   	DiscusszhishiwenzhangView selectView(@Param("ew") Wrapper<DiscusszhishiwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhishiwenzhangEntity> wrapper);
   	

}

