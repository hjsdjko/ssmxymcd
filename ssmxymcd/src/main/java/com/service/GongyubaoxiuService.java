package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyubaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyubaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyubaoxiuView;


/**
 * 公寓报修
 *
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface GongyubaoxiuService extends IService<GongyubaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyubaoxiuVO> selectListVO(Wrapper<GongyubaoxiuEntity> wrapper);
   	
   	GongyubaoxiuVO selectVO(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
   	
   	List<GongyubaoxiuView> selectListView(Wrapper<GongyubaoxiuEntity> wrapper);
   	
   	GongyubaoxiuView selectView(@Param("ew") Wrapper<GongyubaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyubaoxiuEntity> wrapper);
   	
}

