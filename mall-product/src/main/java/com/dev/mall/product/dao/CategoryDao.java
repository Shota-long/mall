package com.dev.mall.product.dao;

import com.dev.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lls
 * @email ${email}
 * @date 2020-10-25 18:09:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
