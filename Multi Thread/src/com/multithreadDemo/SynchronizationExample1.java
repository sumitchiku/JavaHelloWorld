package com.multithreadDemo;

class Increment {
	public int counter = 0;

	synchronized public void increment() {
		for (int i = 1; i <= 1000; i++) {
			counter++;
		}
	}
}

public class SynchronizationExample1 {

	// public static int counter = 0;

	/*
	 * synchronized element will restrict multiple threads to work on the specific
	 * 
	 * element simultaneously.
	 */

	public static void main(String[] args) {
		Increment increase = new Increment();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				increase.increment();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					thread1.join(2000); //after 2 sec lock release
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				increase.increment();
			}
		});

		thread1.start();
		thread2.start();

		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * whenever multiple threads are working on common data there could be
		 * inconsistencies.
		 */
		

		System.out.println("The value of counter is : " + increase.counter);
	}

}
