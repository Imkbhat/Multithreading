package com.kiran.interthreadcommunication;

public class ThreadB {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.start();
		synchronized(a) {
			System.out.println("Main thread call wait() method and enters into waiting state.");
			a.wait();
			System.out.println("Main thread got notification. ");
		}
		System.out.println(a.total);
	}

}
