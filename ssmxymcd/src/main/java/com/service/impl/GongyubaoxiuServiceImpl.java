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


import com.dao.GongyubaoxiuDao;
import com.entity.GongyubaoxiuEntity;
import com.service.GongyubaoxiuService;
import com.entity.vo.GongyubaoxiuVO;
import com.entity.view.GongyubaoxiuView;

@Service("gongyubaoxiuService")
public class GongyubaoxiuServiceImpl extends ServiceImpl<GongyubaoxiuDao, GongyubaoxiuEntity> implements GongyubaoxiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyubaoxiuEntity> page = this.selectPage(
                new Query<GongyubaoxiuEntity>(params).getPage(),
                new EntityWrapper<GongyubaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyubaoxiuEntity> wrapper) {
		  Page<GongyubaoxiuView> page =new Query<GongyubaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyubaoxiuVO> selectListVO(Wrapper<GongyubaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyubaoxiuVO selectVO(Wrapper<GongyubaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyubaoxiuView> selectListView(Wrapper<GongyubaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyubaoxiuView selectView(Wrapper<GongyubaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
