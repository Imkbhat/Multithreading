package com.kiran.join;

public class ChildThreadJoinDemo {
	
	static class MyThread extends Thread {
		
		@Override
		public void run() {
			for (int i=0; i<10; i++) {
				System.out.println("Child thread");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t = new MyThread();
		t.start();
		t.join();
		
		for (int i=0;i<10;i++) {
			System.out.println("Main thread");
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