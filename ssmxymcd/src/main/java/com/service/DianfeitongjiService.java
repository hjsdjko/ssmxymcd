package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianfeitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianfeitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianfeitongjiView;


/**
 * 电费统计
 *
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface DianfeitongjiService extends IService<DianfeitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianfeitongjiVO> selectListVO(Wrapper<DianfeitongjiEntity> wrapper);
   	
   	DianfeitongjiVO selectVO(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
   	
   	List<DianfeitongjiView> selectListView(Wrapper<DianfeitongjiEntity> wrapper);
   	
   	DianfeitongjiView selectView(@Param("ew") Wrapper<DianfeitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianfeitongjiEntity> wrapper);
   	
}

