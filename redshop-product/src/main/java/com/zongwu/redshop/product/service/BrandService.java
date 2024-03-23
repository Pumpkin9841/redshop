package com.zongwu.redshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:19
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

