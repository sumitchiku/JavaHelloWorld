package com.multithreadDemo;

public class VolatileExample {
	volatile public static int flag = 0; //this variable will not c
	//when thread is based upon a variable then always mark variable as volatile variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {
					if (flag == 0) {
						System.out.println("Running......");
					} else {
						break;
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				VolatileExample.flag = 1;
				System.out.println("Flag value Updated");
			}
		}).start();

	}

}
