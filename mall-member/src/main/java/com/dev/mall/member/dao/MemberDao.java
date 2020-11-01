package com.dev.mall.member.dao;

import com.dev.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lls
 * @email ${email}
 * @date 2020-10-25 23:59:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
