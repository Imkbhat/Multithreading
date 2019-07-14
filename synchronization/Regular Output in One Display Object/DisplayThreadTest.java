package com.kiran.synchronization;

public class DisplayThreadTest {

	public static void main(String[] args) {
		
		Display d = new Display();
		DisplayThread th = new DisplayThread(d, "Dhoni");
		DisplayThread th1 = new DisplayThread(d, "Yuvraj");
		th.start();
		th1.start();
	}

}
