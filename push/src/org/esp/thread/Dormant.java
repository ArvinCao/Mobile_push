package org.esp.thread;

/**
 * 休眠类，用于线程的休眠和唤醒
 * @author Arvin
 *
 */
public interface Dormant {

	/**
	 * 进入休眠状态，休眠sleeptime时间
	 * @param sleeptime 休眠的时间
	 * @param runnable 唤醒时所作的动作
	 */
	public void sleep(long sleeptime,Runnable runnable);
	
	/**
	 * 从休眠状态唤醒
	 */
	public void wakeup();
}
