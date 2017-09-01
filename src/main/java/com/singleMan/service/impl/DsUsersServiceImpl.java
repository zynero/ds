package com.singleMan.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singleMan.dao.DsUserMapper;
import com.singleMan.model.DsUser;
import com.singleMan.service.DsUserService;

@Service
public class DsUsersServiceImpl implements DsUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(DsUsersServiceImpl.class);
	
	@Autowired
	DsUserMapper dsUserMapper;
	
	@Override
	public DsUser getDsUserbyId(Integer id) {
		return dsUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveDsUser(DsUser user) {
		return dsUserMapper.insertSelective(user);
	}

}
