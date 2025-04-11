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


import com.dao.DiscusszhishiwenzhangDao;
import com.entity.DiscusszhishiwenzhangEntity;
import com.service.DiscusszhishiwenzhangService;
import com.entity.vo.DiscusszhishiwenzhangVO;
import com.entity.view.DiscusszhishiwenzhangView;

@Service("discusszhishiwenzhangService")
public class DiscusszhishiwenzhangServiceImpl extends ServiceImpl<DiscusszhishiwenzhangDao, DiscusszhishiwenzhangEntity> implements DiscusszhishiwenzhangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhishiwenzhangEntity> page = this.selectPage(
                new Query<DiscusszhishiwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscusszhishiwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhishiwenzhangEntity> wrapper) {
		  Page<DiscusszhishiwenzhangView> page =new Query<DiscusszhishiwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhishiwenzhangVO> selectListVO(Wrapper<DiscusszhishiwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhishiwenzhangVO selectVO(Wrapper<DiscusszhishiwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhishiwenzhangView> selectListView(Wrapper<DiscusszhishiwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhishiwenzhangView selectView(Wrapper<DiscusszhishiwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
