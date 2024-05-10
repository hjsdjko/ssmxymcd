package com.dao;

import com.entity.LoucengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoucengxinxiVO;
import com.entity.view.LoucengxinxiView;


/**
 * 楼层信息
 * 
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface LoucengxinxiDao extends BaseMapper<LoucengxinxiEntity> {
	
	List<LoucengxinxiVO> selectListVO(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
	
	LoucengxinxiVO selectVO(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
	
	List<LoucengxinxiView> selectListView(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);

	List<LoucengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
	
	LoucengxinxiView selectView(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
	
}
