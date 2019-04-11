package com.bob.hms.admin.common.pract.thread;

public class ThreadUsingRunnableandThreadClass {
	
	static class RunnableThread implements Runnable {
		@Override
		public void run() {
		System.out.println("Doing heavy processing Runnable Thread - START "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		} catch (Exception  ex) {
			ex.printStackTrace();
		}
		System.out.println("Doing heavy processing Runnable Thread- ENDS "+Thread.currentThread().getName());
			
		}
		
	}
	
	static class ThreadClassThread extends Thread {
		
		public ThreadClassThread(String threadName) {
			super(threadName);
		}
		
		@Override
		public void run() {
			System.out.println("Doing heavy processing ThreadClassThread - START "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				doDBProcessing();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Doing heavy processing ThreadClassThread- ENDS "+Thread.currentThread().getName());
		}
	}
	
	private static void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableThread(), "t1");
		Thread t2 = new Thread(new RunnableThread(), "t2");
		
		System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
		
		Thread t3 =  new ThreadClassThread("t3");
		Thread t4 =  new ThreadClassThread("t4");
		
		System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThreads has been started");
	}

}
