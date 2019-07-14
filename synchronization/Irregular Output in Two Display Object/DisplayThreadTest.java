package com.kiran.synchronization;

public class DisplayThreadTest {

	public static void main(String[] args) {
		
		Display d = new Display();
		Display d1 = new Display();
		DisplayThread th = new DisplayThread(d, "Dhoni");
		DisplayThread th1 = new DisplayThread(d1, "Yuvraj");
		th.start();
		th1.start();
	}

}
