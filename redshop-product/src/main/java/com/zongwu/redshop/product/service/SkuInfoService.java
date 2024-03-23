package com.zongwu.redshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:18
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

