package com.kiran.interthreadcommunication;

public class ThreadA extends Thread {
	
	int total = 0;
	@Override
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts Calculation.");
		for(int i=1;i<=100;i++) {
			total = total + i;
			}
		System.out.println("Child thread giving notification Call.");
		this.notify();
		}
	}
}
