package org.esp.thread.impl;

import java.util.concurrent.CountDownLatch;

import org.esp.thread.Dormant;

/**
 * 基本的线程休眠类
 * @author Arvin
 *
 */
public class BaseThreadDormant implements Dormant {
	
	private CountDownLatch latch;

	@Override
	public void sleep(long sleeptime,Thread thread) {
		latch = new CountDownLatch(1);
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void wakeup() {
		latch.countDown();
	}

}
