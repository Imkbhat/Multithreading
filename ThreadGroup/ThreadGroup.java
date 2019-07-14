package com.kiran.ThreadGroup;

public class ThreadGroup {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
	}

}
