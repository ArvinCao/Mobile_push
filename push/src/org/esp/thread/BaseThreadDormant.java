package org.esp.thread;

/**
 * 基本的线程休眠类
 * @author Arvin
 *
 */
public class BaseThreadDormant implements Dormant {
	
	private Thread thread;

	@Override
	public void sleep(long sleeptime, Runnable runnable) {
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void wakeup() {
		// TODO Auto-generated method stub

	}

}
