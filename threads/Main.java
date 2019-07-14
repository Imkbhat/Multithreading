package com.kiran.concurrency.threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//We will store thread to check weather they are done
		List<Thread> threads = new ArrayList<>();
		
		//we will create 500 threads
		for (int i=0; i<5; i++) {
			Runnable task = new MyRunnable(10L + i);
			Thread worker = new Thread(task);
			
			//setting the name of a thread
			worker.setName(String.valueOf(i));
			
			//Start the thread, never call run method direct
			worker.start();
			
			//Remember  thread for later usage
			threads.add(worker);
		}
		
		int running = 0;
		do {
			running = 0;
			for (Thread thread : threads) {
				if(thread.isAlive()) {
					running ++;
				}
			}
			System.out.println("We have "+ running +" Running Threads.");
		} while(running > 0);
	}

}