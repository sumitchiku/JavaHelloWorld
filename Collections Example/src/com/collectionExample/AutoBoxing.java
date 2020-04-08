package com.collectionExample;

import java.util.ArrayList;

class intWrapper {
	public int integerValue;

	public intWrapper(int integerValue) {
		this.integerValue = integerValue;
	}

	public int getIntegerValue() {
		return integerValue;
	}

	public void setIntegerValue(int integerValue) {
		this.integerValue = integerValue;
	}

}

public class AutoBoxing {

	public static void main(String[] args) {
		/* autoBoxing :- Wrapper Object to Primitive data type
		 * unBoxing :- Primitive data type to Wrapper Object
		 * autoBoxing and UnBoxing 
		 * ArrayList<Integer> studentNumber = new ArrayList<>();
		 * studentNumber.add(24); //AutoBoxing System.out.println(studentNumber.get(0));
		 * //UnBoxing
		 */

		/*
		 * here we are performing customBoxing and unboxing
		 * 
		 * ArrayList<intWrapper> studentNumber = new ArrayList<>(); //boxing
		 * studentNumber.add(new intWrapper(12)); //unboxing
		 * System.out.println(studentNumber.get(0).getIntegerValue());
		 */

		ArrayList<Double> demoList = new ArrayList<Double>();
		demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); // internal AutoBoxing
		System.out.println(demoList.get(0));
		System.out.println(demoList.get(1).doubleValue());

	}

}
