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


import com.dao.YongdianqingkuangDao;
import com.entity.YongdianqingkuangEntity;
import com.service.YongdianqingkuangService;
import com.entity.vo.YongdianqingkuangVO;
import com.entity.view.YongdianqingkuangView;

@Service("yongdianqingkuangService")
public class YongdianqingkuangServiceImpl extends ServiceImpl<YongdianqingkuangDao, YongdianqingkuangEntity> implements YongdianqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongdianqingkuangEntity> page = this.selectPage(
                new Query<YongdianqingkuangEntity>(params).getPage(),
                new EntityWrapper<YongdianqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongdianqingkuangEntity> wrapper) {
		  Page<YongdianqingkuangView> page =new Query<YongdianqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongdianqingkuangVO> selectListVO(Wrapper<YongdianqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongdianqingkuangVO selectVO(Wrapper<YongdianqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongdianqingkuangView> selectListView(Wrapper<YongdianqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongdianqingkuangView selectView(Wrapper<YongdianqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
