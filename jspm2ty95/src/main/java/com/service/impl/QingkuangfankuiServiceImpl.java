package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QingkuangfankuiDao;
import com.entity.QingkuangfankuiEntity;
import com.service.QingkuangfankuiService;
import com.entity.vo.QingkuangfankuiVO;
import com.entity.view.QingkuangfankuiView;

@Service("qingkuangfankuiService")
public class QingkuangfankuiServiceImpl extends ServiceImpl<QingkuangfankuiDao, QingkuangfankuiEntity> implements QingkuangfankuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingkuangfankuiEntity> page = this.selectPage(
                new Query<QingkuangfankuiEntity>(params).getPage(),
                new EntityWrapper<QingkuangfankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingkuangfankuiEntity> wrapper) {
		  Page<QingkuangfankuiView> page =new Query<QingkuangfankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingkuangfankuiVO> selectListVO(Wrapper<QingkuangfankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingkuangfankuiVO selectVO(Wrapper<QingkuangfankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingkuangfankuiView> selectListView(Wrapper<QingkuangfankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingkuangfankuiView selectView(Wrapper<QingkuangfankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
