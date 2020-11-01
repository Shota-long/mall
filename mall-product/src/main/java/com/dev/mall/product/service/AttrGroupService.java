package com.dev.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-25 18:09:27
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

