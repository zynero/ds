package com.singleMan.dao;

import com.singleMan.model.DsAuth;

public interface DsAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DsAuth record);

    int insertSelective(DsAuth record);

    DsAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DsAuth record);

    int updateByPrimaryKey(DsAuth record);
}