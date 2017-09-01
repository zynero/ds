package com.singleMan.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求辅助类
 * @author nero
 *
 */
public class RequestUtil {
	
	public static String getString(HttpServletRequest request,String name,String default_value) {
		return request.getParameter(name)!=null?request.getParameter(name):default_value;
	}
	
	public static Long getLong(HttpServletRequest request,String name,Long default_value) {
		return request.getParameter(name)!=null?Long.parseLong(request.getParameter(name)):default_value;
	}
	
	
	/**
	 * 判断token是否合法
	 * @param params 除了random意外所有的参数
	 * @param token
	 * @return true 合法 false 不合法
	 */
	public static boolean isTokenLegal(Map<String,Object> params,String token) {
		List<String> list = new ArrayList<String>();
		list.addAll(params.keySet());
		Collections.sort(list);
		StringBuilder calcStr = new StringBuilder();
		for(String k : params.keySet()) {
			calcStr.append(k).append(params.get(k));
		}
		return SignatureUtil.calcSignature(calcStr.toString()).equals(token);
	}
	
	public static boolean isOverTime(Long timestamp) {
		return timestamp-System.currentTimeMillis() < DConstants.OVER_INTERNAL_TIME;
	}
}
