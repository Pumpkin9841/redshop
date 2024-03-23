package com.zongwu.redshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zongwu
 * @email 
 * @date 2024-03-22 21:36:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

