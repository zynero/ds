package com.singleMan.dao;

import com.singleMan.model.DsUser;

public interface DsUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(DsUser record);

    int insertSelective(DsUser record);

    DsUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(DsUser record);

    int updateByPrimaryKey(DsUser record);
}