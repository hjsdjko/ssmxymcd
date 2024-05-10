package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoucengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoucengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoucengxinxiView;


/**
 * 楼层信息
 *
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface LoucengxinxiService extends IService<LoucengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoucengxinxiVO> selectListVO(Wrapper<LoucengxinxiEntity> wrapper);
   	
   	LoucengxinxiVO selectVO(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
   	
   	List<LoucengxinxiView> selectListView(Wrapper<LoucengxinxiEntity> wrapper);
   	
   	LoucengxinxiView selectView(@Param("ew") Wrapper<LoucengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoucengxinxiEntity> wrapper);
   	
}

