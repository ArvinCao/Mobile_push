package org.esp.client;

import java.util.HashMap;
import java.util.Map;

/**
 * 对client进行管理，此类可以用于对client的创建逻辑，进行查询和删除，严格来说 此类是client的工具类
 * 
 * @author Arvin
 * 
 */
public class ClientManager {
	// 已存在的client
	private static Map<String, Client> clients = new HashMap<String, Client>();

	/**
	 * key为用户自定义的拦截参数，value为client的id数组 当用户想反悔给指定用户的时候。可以通过传入拦截参数，然后系统通过查询此Map
	 * 来查询Client的ID
	 */
	private static Map<Object, String[]> client_args = new HashMap<Object, String[]>();

	/**
	 * 获取client实例,先查询缓存中是否存在此client,如果存在便直接返回，如果不存在则创建
	 * @param id sessionId
	 * @return
	 */
	public static Client getClient(String id) {
		Client client = clients.get(id);
		return client;
	}
	
	/**
	 * 根据sessionId删除client
	 * @param id
	 */
	public static void removeClient(String id){
		clients.remove(id);
	}
	
	/**
	 * 添加一个Client实例
	 * @param id
	 */
	public static void creatClient(String id){
		Client client = new Client(id);
		clients.put(id, client);
	}
	
}
