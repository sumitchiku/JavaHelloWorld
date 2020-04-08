package com.multithreadDemo;

public class DeadLockExample {

	public static void main(String[] args) {

		String lockOne = "LockOne";
		String lockTwo = "LockTwo";

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lockOne) {
					System.out.println("Inside Thread 1 On Lock 1");
					synchronized (lockTwo) {
						System.out.println("Inside Thread 1 on Lock 2");
					}
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lockTwo) {
					System.out.println("Inside Thread 2 On Lock 2");
					synchronized (lockOne) {
						System.out.println("Inside Thread 2 on Lock 1");
					}
				}

			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("**********In the Main Method**********");

	}

}
