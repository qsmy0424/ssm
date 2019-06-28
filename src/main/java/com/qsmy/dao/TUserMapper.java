package com.qsmy.dao;

import com.qsmy.entity.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}