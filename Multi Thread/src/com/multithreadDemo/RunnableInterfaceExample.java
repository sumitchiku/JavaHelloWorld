package com.multithreadDemo;

import java.util.Random;

class MyCounyterDemo implements Runnable {
	private int threadNumber;

	public MyCounyterDemo(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		Random random = new Random();
		
	
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is : " + i + " Thread Number : " + threadNumber);
		}

	}

}

public class RunnableInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(new MyCounyterDemo(1));
		Thread thread2 = new Thread(new MyCounyterDemo(2));
		
		thread1.start();
		thread2.start();
		
		System.out.println("*************************");
		System.out.println();
		/* for anonymous object we use below strategy */
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		}).start();
		/*at time of anonymous object we can directly call start() after creating object
		 * but when we have reference we can not directly fire start() 
		 * we can fire start() with the help of reference*/
	}

}
