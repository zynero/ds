package com.singleMan.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加密辅助
 * @author nero
 *
 */
public class SignatureUtil {
	//echo -n quzhiyongzhangyun|md5sum
	private static final String secretKey = "f1c3746aef9f61ad65eb1563e94d89e3";
	
	static String calcSignature(String content) {
		return calcSignature("HmacSHA1", content, secretKey);
	}
	
	/**
	 * 将指定的内容进行加密，默认采用HmacSHA1方式加密，加密后再对内容进行Base64编码
	 * 
	 * @param cryptoType
	 *            加密的类型
	 * @param content
	 *            需要加密的内容
	 * @param secretKey
	 *            加密所需的Key
	 * @return 加密后的数据
	 */
	public static String calcSignature(String cryptoType, String content,
			String secretKey) {
		try {
			Mac mac = Mac.getInstance(cryptoType);
			SecretKeySpec secret = new SecretKeySpec(secretKey.getBytes(),
					cryptoType);
			mac.init(secret);
			byte[] digest = mac.doFinal(content.getBytes());
			sun.misc.BASE64Encoder encode = new sun.misc.BASE64Encoder();
			return encode.encode(digest);
		} catch (Exception e) {
			return "";
		}
	}
	
	
	//test
	public static void main(String[] args) {
		try {
			MessageDigest md5=MessageDigest.getInstance("MD5");
			String str = "quzhiyongzhangyun";
			md5.update(str.getBytes());
			System.out.println(new BigInteger(1,md5.digest()).toString(16));
//			String s = Base64.getEncoder().encodeToString(md5.digest("quzhiyongzhangyun".getBytes()));
//			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
