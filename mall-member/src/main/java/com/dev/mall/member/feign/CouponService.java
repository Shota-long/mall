package com.dev.mall.member.feign;

import com.dev.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lls
 * @version 1.0
 * @date 2020/10/26 18:29
 */
@FeignClient("mall-coupon")    //声明远程服务
public interface CouponService {
    @RequestMapping("/coupon/coupon/membercoupons")
    public R membercoupons();

}
