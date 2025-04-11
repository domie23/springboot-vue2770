package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingkuangfankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingkuangfankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingkuangfankuiView;


/**
 * 情况反馈
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface QingkuangfankuiService extends IService<QingkuangfankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingkuangfankuiVO> selectListVO(Wrapper<QingkuangfankuiEntity> wrapper);
   	
   	QingkuangfankuiVO selectVO(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
   	
   	List<QingkuangfankuiView> selectListView(Wrapper<QingkuangfankuiEntity> wrapper);
   	
   	QingkuangfankuiView selectView(@Param("ew") Wrapper<QingkuangfankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingkuangfankuiEntity> wrapper);
   	

}

