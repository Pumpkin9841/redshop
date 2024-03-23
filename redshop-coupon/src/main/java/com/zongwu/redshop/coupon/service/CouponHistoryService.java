package com.zongwu.redshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:04:34
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

