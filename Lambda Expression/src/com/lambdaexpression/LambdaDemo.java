package com.lambdaexpression;

interface Lambda { // functional Interface : having only one method
	public void demo();
}

public class LambdaDemo {

	public static void main(String[] args) {
		/*
		 * there should be functional interface then only we can use lambda Expression
		 * 
		 * Lambda lambda = new Lambda() {
		 * 
		 * @Override public void demo() {
		 * 
		 * System.out.println("Hello"); } }; lambda.demo();
		 */
		Lambda lambda = () -> System.out.println("Hello");
		lambda.demo();

		Lambda lambda1 = () -> {
			System.out.println("Hi");
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};
		lambda1.demo();

		System.out.println("*****************");

		Thread thread = new Thread(() -> System.out.println("Thread Run."));

		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		
		new Thread(() -> {
			System.out.println("Thread Running very Fast.");
			System.out.println("This is multi line in lambda Expression");
		}).start();

	}

}
