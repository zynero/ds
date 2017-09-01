package com.singleMan.service;

import org.springframework.stereotype.Service;

import com.singleMan.model.DsUser;

public interface DsUserService{
	DsUser getDsUserbyId(Integer id);
	int saveDsUser(DsUser user);
}