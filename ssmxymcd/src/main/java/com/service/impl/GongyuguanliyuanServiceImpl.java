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


import com.dao.GongyuguanliyuanDao;
import com.entity.GongyuguanliyuanEntity;
import com.service.GongyuguanliyuanService;
import com.entity.vo.GongyuguanliyuanVO;
import com.entity.view.GongyuguanliyuanView;

@Service("gongyuguanliyuanService")
public class GongyuguanliyuanServiceImpl extends ServiceImpl<GongyuguanliyuanDao, GongyuguanliyuanEntity> implements GongyuguanliyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuguanliyuanEntity> page = this.selectPage(
                new Query<GongyuguanliyuanEntity>(params).getPage(),
                new EntityWrapper<GongyuguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuguanliyuanEntity> wrapper) {
		  Page<GongyuguanliyuanView> page =new Query<GongyuguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuguanliyuanVO> selectListVO(Wrapper<GongyuguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuguanliyuanVO selectVO(Wrapper<GongyuguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuguanliyuanView> selectListView(Wrapper<GongyuguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuguanliyuanView selectView(Wrapper<GongyuguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
