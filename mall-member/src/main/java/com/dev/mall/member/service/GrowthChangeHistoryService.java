package com.dev.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-25 23:59:10
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

