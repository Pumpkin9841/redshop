package com.zongwu.redshop.order.dao;

import com.zongwu.redshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:07:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
