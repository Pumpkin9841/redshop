package com.zongwu.redshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:04:33
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

