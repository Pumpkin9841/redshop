package com.zongwu.redshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:07:18
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

