package com.bob.hms.admin.common.pract.thread;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		long time = System.currentTimeMillis();
		Thread.sleep(2000);
		System.out.println("System time in Milliseconds "+(System.currentTimeMillis()-time));
	}

}
