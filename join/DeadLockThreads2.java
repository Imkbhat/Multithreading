package com.kiran.join;

public class DeadLockThreads2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join();
	}

}