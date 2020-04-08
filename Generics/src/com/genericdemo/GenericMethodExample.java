package com.genericdemo;

import java.util.ArrayList;
import java.util.List;

class DateDemo1 {
	public <E> void printListData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
		System.out.println("*****END LIST*****");
		System.out.println();

	}
	
	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
		System.out.println("####END ARRAY#####");
		System.out.println();
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		DateDemo1 demoObj = new DateDemo1();
		demoObj.printListData(list);
		
		
		List<String> city = new ArrayList<String>();
		city.add("Jamshedpur");
		city.add("Kolkata");
		city.add("Hyderabad");
		city.add("Banglore");
		city.add("Mumbai");
		city.add("Delhi");
		
		demoObj.printListData(city);
		
		String[] strArray = {"One", "Two", "Three", "Four"};
		demoObj.printArrayData(strArray);

	}

}
