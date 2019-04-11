package com.bob.hms.admin.common.pract.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadUsingCallableandFuture {
	
	static class MyCallable implements Callable<String> {

		@Override
		public String call() throws Exception {
			Thread.sleep(1000);
			return Thread.currentThread().getName();
		}
		
	}

	public static void main(String[] args) {
		//Create Executor Object using Executors  Class, and having 10  threads in pool
		ExecutorService executors = Executors.newFixedThreadPool(10);
		
		//ArrayList to hold all Futures returned by executors
		List<Future<String>> arrList = new ArrayList<>();
		
		//Create MyCallable Instance
		MyCallable callable = new MyCallable();
		for (int i=0; i<100; i++) {
			Future<String> future = executors.submit(callable);
			
			//add Future to the list, we can get return value using Future
			arrList.add(future);
		}
		
		for (Future<String> eachFuture : arrList) {
			try {
				System.out.println(new Date()+ "::"+eachFuture.get());
			} catch(Exception ex) {
				throw new RuntimeException("Runtime Exception Occured ");
			}
		}
		executors.shutdown();
	}
}
