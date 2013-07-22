package org.esp.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.esp.client.ClientManager;

/**
 * 
 * @author Arvin
 *
 */
public class SessionListener implements HttpSessionListener{

	/**
	 * 新建session时创建client实例
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		ClientManager.creatClient(session.getId());
		
	}

	/**
	 * 当session被销毁时，销毁缓存中的client实例
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		ClientManager.removeClient(session.getId());
	}
	
}
