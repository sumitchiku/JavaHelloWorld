package com.arrayDemo;

public class App {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("***************");
		 
		int[] arrayVariable =  new int[10];			//size as 10
		arrayVariable[0]	= 10;
		arrayVariable[1]	= 20;
		arrayVariable[2]	= 30;
		arrayVariable[3]	= 40;
		arrayVariable[4]	= 50;
		
		for(int j = 0; j < arrayVariable.length; j++) {
			System.out.println("value at " + j + " is " + arrayVariable[j]);
		}
		System.out.println("##############################");
		int vals = 10;
		System.out.println("Call By Value");
		CallRefreranceCallValue cbv = new CallRefreranceCallValue();
		cbv.displayValue(vals);
		System.out.println("Main block vlaue holds : " + vals);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String[] names = {"Sumit", "Sharma", "Puloma", "Chakarborty", "Relationship"};
		System.out.println("Call By Refrerance");
		CallRefreranceCallValue cbr = new CallRefreranceCallValue();
		cbr.displayRefrence(names);
		for(String j : names) {
			System.out.println(j);
		}
	}

}
