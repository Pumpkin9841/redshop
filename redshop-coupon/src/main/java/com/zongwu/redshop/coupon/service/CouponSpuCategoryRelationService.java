package com.zongwu.redshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:04:31
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

