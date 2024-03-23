package com.zongwu.redshop.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.Query;

import com.zongwu.redshop.product.dao.CommentReplayDao;
import com.zongwu.redshop.product.entity.CommentReplayEntity;
import com.zongwu.redshop.product.service.CommentReplayService;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}