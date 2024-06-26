package com.zongwu.redshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.product.entity.CommentReplayEntity;
import com.zongwu.redshop.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:18
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

