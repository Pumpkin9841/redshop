package com.zongwu.redshop.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.Query;

import com.zongwu.redshop.order.dao.OrderOperateHistoryDao;
import com.zongwu.redshop.order.entity.OrderOperateHistoryEntity;
import com.zongwu.redshop.order.service.OrderOperateHistoryService;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistoryEntity> page = this.page(
                new Query<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}