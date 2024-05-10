package com.dao;

import com.entity.GongyubaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyubaoxiuVO;
import com.entity.view.GongyubaoxiuView;


/**
 * 公寓报修
 * 
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface GongyubaoxiuDao extends BaseMapper<GongyubaoxiuEntity> {
	
	List<GongyubaoxiuVO> selectListVO(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
	
	GongyubaoxiuVO selectVO(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
	
	List<GongyubaoxiuView> selectListView(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);

	List<GongyubaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
	
	GongyubaoxiuView selectView(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
	
}
