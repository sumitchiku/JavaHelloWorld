package com.multithreadDemo;

import java.util.concurrent.CountDownLatch;

class SomeThread1144 extends Thread {
	private CountDownLatch latch;

	public SomeThread1144(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		
		System.out.println("Thead running with name : " + Thread.currentThread().getName());
		System.out.println("Thread Exection Done");
		System.out.println("***********************");
		latch.countDown();		// PERFORMING UNFOLD of latch
		
	}
}

public class CountDownLatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownLatch latch = new CountDownLatch(4);	//apply locking thread with 4 folds so we have to unfold
														//number of folds not more then thread as each time we are unfolding latch in run method
		SomeThread1144 thread1 = new SomeThread1144(latch);
		SomeThread1144 thread2 = new SomeThread1144(latch);
		SomeThread1144 thread3 = new SomeThread1144(latch);
		SomeThread1144 thread4 = new SomeThread1144(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			latch.await();	//this will release lock after 4 unfolds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//after 4 unfold main block will execute
		System.out.println("I am in main ");
	}

}
