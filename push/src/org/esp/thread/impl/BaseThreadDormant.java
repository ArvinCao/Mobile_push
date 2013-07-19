package org.esp.thread.impl;

import org.esp.thread.Dormant;

/**
 * 基本的线程休眠类
 * @author Arvin
 *
 */
public class BaseThreadDormant implements Dormant {
	
	private Thread thread;

	@Override
	public void sleep(long sleeptime,Thread thread) {
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void wakeup() {
		Thread.interrupted();
	}

}
