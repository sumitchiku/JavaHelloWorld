package com.multithreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
	private String name;

	public SomeThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println("Stating Thread----- " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended____ " + name);
	}
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		to handle more thread we use ExecutorService which execute the things
		ExecutorService executerService = Executors.newFixedThreadPool(10); // max thread can execute using executor is 2 at a time

		SomeThread thread1 = new SomeThread("Thread 1");
		SomeThread thread2 = new SomeThread("Thread 2");
		SomeThread thread3 = new SomeThread("Thread 3");
		SomeThread thread4 = new SomeThread("Thread 4");
		SomeThread thread5 = new SomeThread("Thread 5");
		SomeThread thread6 = new SomeThread("Thread 6");
		SomeThread thread7 = new SomeThread("Thread 7");
		SomeThread thread8 = new SomeThread("Thread 8");
		SomeThread thread9 = new SomeThread("Thread 9");
		SomeThread thread10 = new SomeThread("Thread 10");
		SomeThread thread11 = new SomeThread("Thread 11");
		SomeThread thread12 = new SomeThread("Thread 12");
		SomeThread thread13 = new SomeThread("Thread 13");
		SomeThread thread14 = new SomeThread("Thread 14");
		SomeThread thread15 = new SomeThread("Thread 15");
		SomeThread thread16 = new SomeThread("Thread 16");
		SomeThread thread17 = new SomeThread("Thread 17");
		SomeThread thread18 = new SomeThread("Thread 18");
		SomeThread thread19 = new SomeThread("Thread 19");
		SomeThread thread20 = new SomeThread("Thread 20");
	
		/* if we use ExecutorService then we dont use start() executor will take care of that
		 thread1.start();
		 thread2.start();
		 thread3.start();
		 thread4.start();
		 thread5.start();
		 thread6.start();
		 thread7.start();
		 thread8.start();
		 thread9.start();
		 thread10.start();
		 thread11.start();
		 thread12.start();
		 thread13.start();
		 thread14.start();
		 thread15.start();
		 thread16.start();
		 thread17.start();
		 thread18.start();
		 thread19.start();
		 thread20.start();
		 */
		
		executerService.execute(thread1);
		executerService.execute(thread2);
		executerService.execute(thread3);
		executerService.execute(thread4);
		executerService.execute(thread5);
		executerService.execute(thread6);
		executerService.execute(thread7);
		executerService.execute(thread8);
		executerService.execute(thread9);
		executerService.execute(thread10);
		executerService.execute(thread11);
		executerService.execute(thread12);
		executerService.execute(thread13);
		executerService.execute(thread14);
		executerService.execute(thread15);
		executerService.execute(thread16);
		executerService.execute(thread17);
		executerService.execute(thread18);
		executerService.execute(thread19);
		executerService.execute(thread20);

		executerService.shutdown();
		 
	}

}
