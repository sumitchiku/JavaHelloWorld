package com.exception.multicatch;

public class CatchBlock {
	public void calculate(int x) {
		int x1 = 0, y = 5;
		try {
			System.out.println("Before Exception Operation");
			System.out.println("Operating Exception" + x/0);
//			x1 = (y = 10 * 10) / 0;
			System.out.println("After Exception Operation");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside Arithmetic Exception exception catch block ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside Exception catch block ");
		}
		finally {
			System.out.println("Finally Block is executed always no matter excwption occur or not");
		}
//		System.out.println("*********************************");
//		System.out.println(y);
//		System.out.println("after y is initilize then exception ooccur");
	}

}
