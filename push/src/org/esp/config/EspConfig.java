package org.esp.config;

/**
 * 一些基础配置，用于初始化时读取和存储必须的基础配置
 * @author Arvin
 *
 */
public class EspConfig {
	// 长连接请求时间，默认为60秒
	public static long KEEP_CONNECTION_TIME = 60000L;

	// 是否开启移动推送方式，默认不开启
	public static boolean MOBILE_PUSH = false;

	// 是否开启web推送方式，默认为不开启
	public static boolean WEB_PUSH = false;
	
	//网络传输的数据类型，默认为json
	public static String DATA_TYPE = "JSON";
	
}
