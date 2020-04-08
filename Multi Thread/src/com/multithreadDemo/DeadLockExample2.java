package com.multithreadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample2 {

	public static void main(String[] args) {

		Lock lockOne = new ReentrantLock();
		Lock lockTwo = new ReentrantLock();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						if (!flagLock1) {
							flagLock1 = lockOne.tryLock();
						}
						if (!flagLock2) {
							flagLock2 = lockTwo.tryLock();
						}
					} finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside Thread 1 On Lock 1");
							lockOne.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside Thread 1 on Lock 2");
							lockTwo.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						if (!flagLock1) {
							flagLock1 = lockOne.tryLock();
						}
						if (!flagLock2) {
							flagLock2 = lockTwo.tryLock();
						}

					} finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside Thread 2 On Lock 1");
							lockOne.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside Thread 2 on Lock 2");
							lockTwo.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}
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
