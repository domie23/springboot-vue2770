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


import com.dao.WenjuandajuanDao;
import com.entity.WenjuandajuanEntity;
import com.service.WenjuandajuanService;
import com.entity.vo.WenjuandajuanVO;
import com.entity.view.WenjuandajuanView;

@Service("wenjuandajuanService")
public class WenjuandajuanServiceImpl extends ServiceImpl<WenjuandajuanDao, WenjuandajuanEntity> implements WenjuandajuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuandajuanEntity> page = this.selectPage(
                new Query<WenjuandajuanEntity>(params).getPage(),
                new EntityWrapper<WenjuandajuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuandajuanEntity> wrapper) {
		  Page<WenjuandajuanView> page =new Query<WenjuandajuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuandajuanVO> selectListVO(Wrapper<WenjuandajuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuandajuanVO selectVO(Wrapper<WenjuandajuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuandajuanView> selectListView(Wrapper<WenjuandajuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuandajuanView selectView(Wrapper<WenjuandajuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
