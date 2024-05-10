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


import com.dao.DianfeitongjiDao;
import com.entity.DianfeitongjiEntity;
import com.service.DianfeitongjiService;
import com.entity.vo.DianfeitongjiVO;
import com.entity.view.DianfeitongjiView;

@Service("dianfeitongjiService")
public class DianfeitongjiServiceImpl extends ServiceImpl<DianfeitongjiDao, DianfeitongjiEntity> implements DianfeitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianfeitongjiEntity> page = this.selectPage(
                new Query<DianfeitongjiEntity>(params).getPage(),
                new EntityWrapper<DianfeitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianfeitongjiEntity> wrapper) {
		  Page<DianfeitongjiView> page =new Query<DianfeitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianfeitongjiVO> selectListVO(Wrapper<DianfeitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianfeitongjiVO selectVO(Wrapper<DianfeitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianfeitongjiView> selectListView(Wrapper<DianfeitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianfeitongjiView selectView(Wrapper<DianfeitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
