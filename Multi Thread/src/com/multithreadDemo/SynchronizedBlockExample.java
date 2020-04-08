package com.multithreadDemo;

class PatternPrinting {
	
	private Object lock = "lock"; // making this as private as no one can modify this lock
	
	public void print() {
		/* monitor lock is applied bellow */
		// synchronized (this) { // synchronized block takes current object as parameter
		
		synchronized (lock) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}

			}
			System.out.println();
		}

		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*
 * in synchronized method for below 2 run() will take compilation time as 5410ms
 * in synchronized block for below 2 run() will take compilation time as 3700ms
 */
public class SynchronizedBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PatternPrinting pattern1 = new PatternPrinting();
		//PatternPrinting pattern2 = new PatternPrinting();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					pattern1.print();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Total Time for pattern 1 : " + (endtTime - startTime));
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					pattern1.print();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Total Time for pattern 2: " + (endtTime - startTime));
			}
		}).start();

	}

}
