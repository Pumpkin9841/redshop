package com.zongwu.redshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:07:17
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

