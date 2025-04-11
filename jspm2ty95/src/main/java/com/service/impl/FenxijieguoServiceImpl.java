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


import com.dao.FenxijieguoDao;
import com.entity.FenxijieguoEntity;
import com.service.FenxijieguoService;
import com.entity.vo.FenxijieguoVO;
import com.entity.view.FenxijieguoView;

@Service("fenxijieguoService")
public class FenxijieguoServiceImpl extends ServiceImpl<FenxijieguoDao, FenxijieguoEntity> implements FenxijieguoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxijieguoEntity> page = this.selectPage(
                new Query<FenxijieguoEntity>(params).getPage(),
                new EntityWrapper<FenxijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxijieguoEntity> wrapper) {
		  Page<FenxijieguoView> page =new Query<FenxijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxijieguoVO> selectListVO(Wrapper<FenxijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxijieguoVO selectVO(Wrapper<FenxijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxijieguoView> selectListView(Wrapper<FenxijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxijieguoView selectView(Wrapper<FenxijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
