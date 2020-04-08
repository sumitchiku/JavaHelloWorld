package com.multithreadDemo;

class Pattern {
	synchronized public void print() {		//method synchronized
		for (int i = 0; i < 10; i++) {
			if (i <= 5)
				System.out.print("[");
			else
				System.out.print("]");
		}
		System.out.println();
	}
}

public class SynchronizedMethodExample {

	public static void main(String[] args) {

		Pattern pattern = new Pattern();

		/*
		 * If we deals with only one object then we will have synchronized method will
		 * work fine
		 */

		Pattern pattern2 = new Pattern();
		/*
		 * if we create 2 object and access one single synchronized method then we will
		 * When we mark a specific element as synchronized or intrinsic LOC a monitor
		 * LOC would be applied.
		 * 
		 * Now this lock is specific to objects.
		 * 
		 * Now whenever we are making use of different objects locks are on different
		 * objects that are multiple
		 * 
		 * locks reserved the locks are nullified and we won't be able to get a proper
		 * and consistent output.
		 * 
		 * in this synchronized bloxk will helpfull
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					pattern.print();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					pattern2.print();
				}
			}
		}).start();

	}

}
