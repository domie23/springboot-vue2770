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


import com.dao.ZhishiwenzhangDao;
import com.entity.ZhishiwenzhangEntity;
import com.service.ZhishiwenzhangService;
import com.entity.vo.ZhishiwenzhangVO;
import com.entity.view.ZhishiwenzhangView;

@Service("zhishiwenzhangService")
public class ZhishiwenzhangServiceImpl extends ServiceImpl<ZhishiwenzhangDao, ZhishiwenzhangEntity> implements ZhishiwenzhangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishiwenzhangEntity> page = this.selectPage(
                new Query<ZhishiwenzhangEntity>(params).getPage(),
                new EntityWrapper<ZhishiwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishiwenzhangEntity> wrapper) {
		  Page<ZhishiwenzhangView> page =new Query<ZhishiwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishiwenzhangVO> selectListVO(Wrapper<ZhishiwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishiwenzhangVO selectVO(Wrapper<ZhishiwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishiwenzhangView> selectListView(Wrapper<ZhishiwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishiwenzhangView selectView(Wrapper<ZhishiwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
