package com.zongwu.redshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:06:13
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

