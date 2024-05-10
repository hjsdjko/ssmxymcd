package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongdianqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongdianqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongdianqingkuangView;


/**
 * 用电情况
 *
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
public interface YongdianqingkuangService extends IService<YongdianqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongdianqingkuangVO> selectListVO(Wrapper<YongdianqingkuangEntity> wrapper);
   	
   	YongdianqingkuangVO selectVO(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
   	
   	List<YongdianqingkuangView> selectListView(Wrapper<YongdianqingkuangEntity> wrapper);
   	
   	YongdianqingkuangView selectView(@Param("ew") Wrapper<YongdianqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongdianqingkuangEntity> wrapper);
   	
}

