package com.singleMan.dao;

import com.singleMan.model.DsEquip;

public interface DsEquipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DsEquip record);

    int insertSelective(DsEquip record);

    DsEquip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DsEquip record);

    int updateByPrimaryKey(DsEquip record);
}