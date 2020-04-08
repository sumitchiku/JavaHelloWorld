package com.userexception;

import java.io.FileNotFoundException;

import com.userexception.demo.CheckedUnchecked;
import com.userexception.demo.UserDefinedException;
import com.userexception.demo.UserException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserException ue = new UserException();
		try {
			ue.userException();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UserDefinedException e) {
//			System.out.println("Exception of Exception Is displaying......");
			e.printStackTrace();
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Exception of Exception Is displaying......");
		}
//		CheckedUnchecked ck = new CheckedUnchecked();
//		ck.someExtraMethod();
		System.out.println();
	}

}
