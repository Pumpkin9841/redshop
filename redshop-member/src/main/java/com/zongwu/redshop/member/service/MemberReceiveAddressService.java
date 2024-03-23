package com.zongwu.redshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:06:13
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

