package com.singleMan.utils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态参数类
 * @author nero
 *
 */
public class DConstants {
	
	public static final String SUCCESS = "success";
	
	public static final String LESS_PARAM = "less params";
	public static final String SIG_ERROR = "sig error";
	public static final String OVER_TIME = "over time";
	
	//超时时间
	public static final int OVER_INTERNAL_TIME = 5 * 60 * 1000;
	
	private static ConcurrentHashMap<String, Object> tokens = new ConcurrentHashMap<String,Object>();
	
	public static void putToken(String token) {
		tokens.put(token, null);
	}
	
	public static boolean hasToken(String token) {
		return tokens.containsKey(token);
	}
}
