package com.multithreadDemo;

public class InterruptsExample {

	static public int balance = 500;

	public void withdraw(int amount) {
		System.out.println("Checking Balance...");
		synchronized (this) {
			if (balance <= 0 || balance < amount) {
				try {
					System.out.println("Wait let me deposit 3000/- by thread then catch block execute");
					wait();
				} catch (InterruptedException e) {
					System.out.println("Performing Transection " + amount);
					balance = balance - amount;
					System.out.println("Withdrawal successfully. Current Balance " + balance);
				}
			} else {
				System.out.println("inside Else Block");
			}
		}
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposit Successfully. Current Balance " + balance);
	}

	public static void main(String[] args) {

		InterruptsExample obj = new InterruptsExample();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				obj.withdraw(650);
			}
		});
		thread1.setName("Thread_1");

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				obj.deposit(3000);
				thread1.interrupt();
			}
		});
		thread2.setName("Thread_2");

		thread1.start();
		thread2.start();

//		if(balance <= 0) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			thread1.interrupt();
//		}

	}

}
