package com.entity.view;

import com.entity.DianfeitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电费统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 22:36:29
 */
@TableName("dianfeitongji")
public class DianfeitongjiView  extends DianfeitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianfeitongjiView(){
	}
 
 	public DianfeitongjiView(DianfeitongjiEntity dianfeitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, dianfeitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
