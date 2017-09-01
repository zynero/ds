package com.singleMan.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.singleMan.model.DsUser;
import com.singleMan.service.DsUserService;
import com.singleMan.utils.DConstants;
import com.singleMan.utils.RequestUtil;
import com.singleMan.utils.ResponseUtil;

/**
 * 用户认证相关处理controller
 * @author nero
 *
 */
@Controller
@RequestMapping(value="/singlepy")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static Object o = new Object();
	
	@Autowired
	DsUserService dsUsersService;
	
	@RequestMapping(value="/testpath")
	@ResponseBody
	public String testPath(HttpServletRequest request,HttpServletResponse response) {
		DsUser user = dsUsersService.getDsUserbyId(1);
		logger.info(user.toString());
		return user.toString();
	}
	
	/**
	 * 手机注册
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/phoneRegister",method=RequestMethod.POST)
	@ResponseBody
	public String phoneRegister(HttpServletRequest request,HttpServletResponse response) {
		String phoneNumber = RequestUtil.getString(request, "phoneNumber", "");
		String password = RequestUtil.getString(request, "password", "");
		String token = RequestUtil.getString(request, "token", "");
		Long timestamp = RequestUtil.getLong(request, "timestamp", 0l);
		if(phoneNumber.equals("") || password.equals("") || timestamp.equals(0))
			return ResponseUtil.getResponse(-1, DConstants.LESS_PARAM, o);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("phoneNumber", phoneNumber);
		params.put("password", password);
		params.put("timestamp", timestamp);
		if(!RequestUtil.isTokenLegal(params, token))
			return ResponseUtil.getResponse(-1, DConstants.SIG_ERROR, o);
		if(!RequestUtil.isOverTime(timestamp))
			return ResponseUtil.getResponse(-1, DConstants.OVER_TIME, o);
		DsUser user = new DsUser();
		user.setPassword(password);
		user.setPhone(phoneNumber);
		int uid = dsUsersService.saveDsUser(user);
		user.setUid(uid);
		return ResponseUtil.getResponse(0, DConstants.SUCCESS, user);
	}
	
	
}
