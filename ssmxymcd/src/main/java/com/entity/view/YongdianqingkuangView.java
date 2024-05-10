package com.entity.view;

import com.entity.YongdianqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用电情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
@TableName("yongdianqingkuang")
public class YongdianqingkuangView  extends YongdianqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongdianqingkuangView(){
	}
 
 	public YongdianqingkuangView(YongdianqingkuangEntity yongdianqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, yongdianqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
