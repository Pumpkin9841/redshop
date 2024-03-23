package com.zongwu.redshop.product.dao;

import com.zongwu.redshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
