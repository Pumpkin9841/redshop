package com.zongwu.redshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:04:33
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

