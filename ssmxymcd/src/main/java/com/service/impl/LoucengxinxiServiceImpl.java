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


import com.dao.LoucengxinxiDao;
import com.entity.LoucengxinxiEntity;
import com.service.LoucengxinxiService;
import com.entity.vo.LoucengxinxiVO;
import com.entity.view.LoucengxinxiView;

@Service("loucengxinxiService")
public class LoucengxinxiServiceImpl extends ServiceImpl<LoucengxinxiDao, LoucengxinxiEntity> implements LoucengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoucengxinxiEntity> page = this.selectPage(
                new Query<LoucengxinxiEntity>(params).getPage(),
                new EntityWrapper<LoucengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoucengxinxiEntity> wrapper) {
		  Page<LoucengxinxiView> page =new Query<LoucengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoucengxinxiVO> selectListVO(Wrapper<LoucengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoucengxinxiVO selectVO(Wrapper<LoucengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoucengxinxiView> selectListView(Wrapper<LoucengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoucengxinxiView selectView(Wrapper<LoucengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
