package com.dev.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-25 23:59:10
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

