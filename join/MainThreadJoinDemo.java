package com.kiran.join;

public class MainThreadJoinDemo {
	
	static class MyThread extends Thread {
		
		static Thread mainThread;
		
		@Override
		public void run() {
			
			try {
				mainThread.join();
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
			for (int i=0; i<10; i++) {
				System.out.println("Child thread");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyThread.mainThread = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.join();
		for (int i=0;i<10;i++) {
			System.out.println("Main thread");
			Thread.sleep(2000);
		}
		
	}

}

/* OutPut
 * Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread

 * 
 * 
 * 
 */