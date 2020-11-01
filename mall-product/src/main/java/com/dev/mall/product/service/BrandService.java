package com.dev.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-25 18:09:27
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

