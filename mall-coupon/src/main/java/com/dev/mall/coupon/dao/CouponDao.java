package com.dev.mall.coupon.dao;

import com.dev.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lls
 * @email ${email}
 * @date 2020-10-25 23:52:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
