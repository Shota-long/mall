package com.dev.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-25 23:52:29
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

