package com.zongwu.redshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:06:13
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

