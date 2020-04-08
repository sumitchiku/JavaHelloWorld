package com.exception;

import java.io.FileNotFoundException;

import com.exception.multicatch.CatchBlock;
import com.exception.multicatch.ThrowsAndThrow;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
//		App obj = new App();
//		obj.case2(10, 0);
		CatchBlock cb = new CatchBlock();
		cb.calculate(5);
		System.out.println();
		System.out.println("**********Working with THROWS and THROW Keywords**********");
		ThrowsAndThrow th = new ThrowsAndThrow();
		//th.someMethod();
		try {
			th.someMoreMethod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Hello from CATCH OF THROW");
		} 
		System.out.println("Bye bye");
	}
	
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x/y);
		} else {
			System.out.println("The value of y is 0");
		}
		
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
