package com.zongwu.redshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:06:14
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

