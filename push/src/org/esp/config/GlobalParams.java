package org.esp.config;

/**
 * 全局参数.定义一些时常用到的常量
 * 
 * @author Arvin
 * 
 */
public class GlobalParams {
	// 使用JSON作为数据传输时的类型
	public static final String DATA_JSON = "JSON";
	
	//使用google的protobuf作为数据传输时的类型
	public static final String DATA_PROTOBUF = "Protobuf";
	
	//发送方为浏览器的常量
	public static final int WEB = 1;
	
	//发送方为移动端的常量
	public static final int MOBILE = 2;
	
}
