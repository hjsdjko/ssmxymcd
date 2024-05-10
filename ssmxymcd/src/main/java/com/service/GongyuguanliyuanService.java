package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuguanliyuanView;


/**
 * 公寓管理员
 *
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface GongyuguanliyuanService extends IService<GongyuguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuguanliyuanVO> selectListVO(Wrapper<GongyuguanliyuanEntity> wrapper);
   	
   	GongyuguanliyuanVO selectVO(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
   	
   	List<GongyuguanliyuanView> selectListView(Wrapper<GongyuguanliyuanEntity> wrapper);
   	
   	GongyuguanliyuanView selectView(@Param("ew") Wrapper<GongyuguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuguanliyuanEntity> wrapper);
   	
}

