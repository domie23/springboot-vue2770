package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxijieguoView;


/**
 * 分析结果
 *
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
public interface FenxijieguoService extends IService<FenxijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxijieguoVO> selectListVO(Wrapper<FenxijieguoEntity> wrapper);
   	
   	FenxijieguoVO selectVO(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
   	
   	List<FenxijieguoView> selectListView(Wrapper<FenxijieguoEntity> wrapper);
   	
   	FenxijieguoView selectView(@Param("ew") Wrapper<FenxijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxijieguoEntity> wrapper);
   	

}

