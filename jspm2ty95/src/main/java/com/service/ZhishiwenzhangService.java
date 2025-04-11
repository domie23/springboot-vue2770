package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishiwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishiwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishiwenzhangView;


/**
 * 知识文章
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface ZhishiwenzhangService extends IService<ZhishiwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishiwenzhangVO> selectListVO(Wrapper<ZhishiwenzhangEntity> wrapper);
   	
   	ZhishiwenzhangVO selectVO(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
   	
   	List<ZhishiwenzhangView> selectListView(Wrapper<ZhishiwenzhangEntity> wrapper);
   	
   	ZhishiwenzhangView selectView(@Param("ew") Wrapper<ZhishiwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishiwenzhangEntity> wrapper);
   	

}

