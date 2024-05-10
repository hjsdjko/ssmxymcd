package com.dao;

import com.entity.GongyuguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuguanliyuanVO;
import com.entity.view.GongyuguanliyuanView;


/**
 * 公寓管理员
 * 
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface GongyuguanliyuanDao extends BaseMapper<GongyuguanliyuanEntity> {
	
	List<GongyuguanliyuanVO> selectListVO(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
	
	GongyuguanliyuanVO selectVO(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
	
	List<GongyuguanliyuanView> selectListView(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);

	List<GongyuguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
	
	GongyuguanliyuanView selectView(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
	
}
