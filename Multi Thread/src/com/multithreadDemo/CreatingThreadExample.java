package com.multithreadDemo;

class MyCounyter extends Thread {
	private int threadNumber;

	public MyCounyter(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public void countMe() throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			Thread.sleep(500);
			/*
			 * It will stop the process for some specific pain and we will give the counter
			 * as a value of 10000 milliseconds.
			 */
			System.out.println("The value of i is : " + i + " Thread Number : " + threadNumber);
		}
	}

	@Override
	public void run() {
		try {
			countMe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class CreatingThreadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyCounyter count1 = new MyCounyter(1);
		MyCounyter count2 = new MyCounyter(2);

		long startTime = System.currentTimeMillis();
		// count1.countMe();
		count1.start();
		System.out.println("***********");
//		count2.countMe();
		count2.start();
		count1.join(); // OR we can Sleep Main() for 4510 millisecond
		count2.join();
		long endTime = System.currentTimeMillis();
		System.out.println("Total time req. to compile application is : " + (endTime - startTime));

		/* total time for normal compilation is approx 9 Seconds */
		/*
		 * total time for Thread extends and use run() compilation is approx 4.6 Seconds
		 */

	}

}
