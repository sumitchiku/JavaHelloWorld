package com.multithreadDemo;

public class WaitNotifyExample {
	static public int balance = 0;

	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0 || balance < amount) {
				try {
					System.out.println("Waiting for Transection...");
					wait();
					// enclosed with synchronized method/block
					// wait() make program to run infinte. so use notify() or wait(timeout value) OR interrupt()
					// method
//					wait(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		balance = balance - amount;
		System.out.println("Withdrawal successfully. Current Balance " + balance);
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposit Successfully. Current Balance " + balance);
		synchronized (this) {

//			notifyAll(); // use synchronized block, release all wait() any where in method
			notify(); // it will release one wait() based of priority OR (FIFO Thread)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaitNotifyExample obj = new WaitNotifyExample();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				obj.withdraw(250);
			}
		});
		thread1.setName("Thread_1");

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj.deposit(1000);
			}
		});
		thread2.setName("Thread_2");

		thread1.start();
		thread2.start();

	}

}
