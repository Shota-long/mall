package com.dev.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dev.common.utils.PageUtils;
import com.dev.common.utils.Query;

import com.dev.mall.product.dao.CategoryDao;
import com.dev.mall.product.entity.CategoryEntity;
import com.dev.mall.product.service.CategoryService;


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
        //查询所有数据
        List<CategoryEntity> entityList = baseMapper.selectList(null);
        /**
         * 树形化
         *  1、找到一级分类
        */
        List<CategoryEntity> level1Menus = entityList.stream().filter((categoryEntity) -> {
            return categoryEntity.getCatLevel() == 1;
        }).map((menu)->{
            menu.setChild(getChilds(menu,entityList));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());}).collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 删除menus的条件判断
        baseMapper.deleteBatchIds(asList);
    }

    public List<CategoryEntity> getChilds(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> childLevel = all.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid()==root.getCatId();
        }).map((menu)->{
            menu.setChild(getChilds(menu,all));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());}).collect(Collectors.toList());
        return childLevel;
    }

}