package com.dev.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.common.utils.PageUtils;
import com.dev.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lls
 * @email ${email}
 * @date 2020-10-26 00:09:54
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

