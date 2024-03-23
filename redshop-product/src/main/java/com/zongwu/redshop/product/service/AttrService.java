package com.zongwu.redshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

