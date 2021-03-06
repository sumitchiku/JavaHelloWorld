package com.multithreadDemo;

class Pattern12334 {
	/* we can hgave non-Static method also*/

	synchronized static public void print(String threadCode) { // method synchronized
		for (int i = 0; i < 10; i++) {
			if (i <= 5)
				System.out.print("[");
			else
				System.out.print("]");
		}
		System.out.println("Generated by thread : " + threadCode);
	}
}

public class StaticSynchronizedExample {

	public static void main(String[] args) {

//		Pattern12334 pattern1 = new Pattern12334("Thread1");
//		Pattern12334 pattern2 = new Pattern12334("Thread2");
		/* when we use two object then we use approach of static synchronized */

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Pattern12334.print("Thread1");
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Pattern12334.print("Thread2");
				}
			}
		}).start();

	}

}
