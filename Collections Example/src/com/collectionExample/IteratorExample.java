package com.collectionExample;

import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {

		List<String> city = new LinkedList<String>();
		city.add("Hyderabad");
		city.add("Banglore");
		city.add("Kolkata");
		city.add("Pune");
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Jamshedpur");
		city.add("Andhara");
		
		new IteratorExample().printList(city);

	}

	void printList(List<String> list) {

		java.util.Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Element holding Country: " + iterator.next());
		}
		System.out.println("************************");
	}

}
