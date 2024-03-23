package com.zongwu.redshop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:08:27
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

