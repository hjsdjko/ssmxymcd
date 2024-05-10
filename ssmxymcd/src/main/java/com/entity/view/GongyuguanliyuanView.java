package com.entity.view;

import com.entity.GongyuguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公寓管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
@TableName("gongyuguanliyuan")
public class GongyuguanliyuanView  extends GongyuguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyuguanliyuanView(){
	}
 
 	public GongyuguanliyuanView(GongyuguanliyuanEntity gongyuguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, gongyuguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
