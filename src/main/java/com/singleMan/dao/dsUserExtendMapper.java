package com.singleMan.dao;

import com.singleMan.model.dsUserExtend;

public interface dsUserExtendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dsUserExtend record);

    int insertSelective(dsUserExtend record);

    dsUserExtend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dsUserExtend record);

    int updateByPrimaryKey(dsUserExtend record);
}