package com.zongwu.redshop.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.Query;

import com.zongwu.redshop.product.dao.CategoryDao;
import com.zongwu.redshop.product.entity.CategoryEntity;
import com.zongwu.redshop.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        List<CategoryEntity> entities = categoryEntityList.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((rootCategory) -> {
                    rootCategory.setChildren(getChildrens(rootCategory, categoryEntityList));
                    return rootCategory;
                }).sorted((category1, category2) -> {
                    return (category1.getSort() == null ? 0 : category1.getSort()) - (category2.getSort() == null ? 0 : category2.getSort());
                }).collect(Collectors.toList());

        return entities;
    }


    private List<CategoryEntity> getChildrens(CategoryEntity rootCategory, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> children = categoryEntityList.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(rootCategory.getCatId()))
                .map((categoryEntity) -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, categoryEntityList));
                    return categoryEntity;
                }).sorted((category1, category2) -> {
                    return (category1.getSort() == null ? 0 : category1.getSort()) - (category2.getSort() == null ? 0 : category2.getSort());
                }).collect(Collectors.toList());
        return children;
    }

}