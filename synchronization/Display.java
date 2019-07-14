package com.kiran.synchronization;

public class Display {
	
	public synchronized void displayNum() {
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void displayChar() {
		for (int i=65; i<=75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
