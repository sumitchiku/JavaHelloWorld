package com.arrayDemo;

public class CallRefreranceCallValue {

	public void displayValue(int value) {
		value = 20;
		System.out.println("Current Value holds : " + value);
		System.out.println("only value is passed but not address of that variable");
	}

	public void displayRefrence(String[] values) {
		for (String name : values) {
			System.out.println("Current Value holds in call by refrerance : " + name);
		}
		values[4] = "We are Not Together";
		System.out.println("in refrerance we pass Address do we can modify actual variable value in calling function");
	}
}
