package org.esp.client;

import java.util.HashMap;
import java.util.Map;

/**
 * 当一个长连接被开启时，便创建此对象，该类代表着此次发送长连接请求的客户端
 * 推送时用此对象进行过滤操作
 * @author Arvin
 *
 */
public class Client {
	private String sessionId;//httpsessionId
	
	private Object arg;//用户自定义属性
	
	/**
	 * 设置自定义属性，用于推送时的过滤操作
	 * @param obj 自定义属性
	 */
	public void setAttribute(Object obj){
		this.arg = obj;
	}
	
	public Object getAttrubyte(){
		return arg;
	}
}
