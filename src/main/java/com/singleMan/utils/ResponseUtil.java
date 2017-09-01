package com.singleMan.utils;

import com.alibaba.fastjson.JSONObject;
import com.singleMan.model.DsUser;

/**
 * json包装器
 * @author nero
 *
 */
public class ResponseUtil {
	
	public static String getResponse(int code,String message,Object data) {
		JSONObject json = new JSONObject();
		json.put("status",code);
		json.put("msg", message);
		json.put("result", data);
		return json.toJSONString();
	}
	
	public static void main(String[] args) {
		System.out.println(getResponse(-1, "error", new Object()));
		DsUser u = new DsUser();
		u.setNickname("nero");
		System.out.println(getResponse(0, "success", u));
	}
}
