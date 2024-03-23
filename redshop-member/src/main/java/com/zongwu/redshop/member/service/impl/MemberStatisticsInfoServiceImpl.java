package com.zongwu.redshop.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.Query;

import com.zongwu.redshop.member.dao.MemberStatisticsInfoDao;
import com.zongwu.redshop.member.entity.MemberStatisticsInfoEntity;
import com.zongwu.redshop.member.service.MemberStatisticsInfoService;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new Query<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<MemberStatisticsInfoEntity>()
        );

        return new PageUtils(page);
    }

}