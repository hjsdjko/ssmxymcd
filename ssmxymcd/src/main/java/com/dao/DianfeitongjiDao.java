package com.dao;

import com.entity.DianfeitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianfeitongjiVO;
import com.entity.view.DianfeitongjiView;


/**
 * 电费统计
 * 
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface DianfeitongjiDao extends BaseMapper<DianfeitongjiEntity> {
	
	List<DianfeitongjiVO> selectListVO(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
	
	DianfeitongjiVO selectVO(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
	
	List<DianfeitongjiView> selectListView(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);

	List<DianfeitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
	
	DianfeitongjiView selectView(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
	
}
