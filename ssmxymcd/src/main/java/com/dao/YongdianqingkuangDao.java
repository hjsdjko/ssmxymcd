package com.dao;

import com.entity.YongdianqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongdianqingkuangVO;
import com.entity.view.YongdianqingkuangView;


/**
 * 用电情况
 * 
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface YongdianqingkuangDao extends BaseMapper<YongdianqingkuangEntity> {
	
	List<YongdianqingkuangVO> selectListVO(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
	
	YongdianqingkuangVO selectVO(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
	
	List<YongdianqingkuangView> selectListView(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);

	List<YongdianqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
	
	YongdianqingkuangView selectView(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
	
}
