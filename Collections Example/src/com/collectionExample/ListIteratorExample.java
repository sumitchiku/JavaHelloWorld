package com.collectionExample;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> city = new LinkedList<String>();
		city.add("Hyderabad");
		city.add("Banglore");
		city.add("Kolkata");
		city.add("Pune");
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Jamshedpur");
		city.add("Andhara");

		ListIteratorExample listIteratorObject = new ListIteratorExample();
		listIteratorObject.printList(city);
		city.sort(null);
		listIteratorObject.printList(city);
		System.out.println("###################");
		Collections.reverse(city);
		listIteratorObject.printList(city);

	}

	void printList(List<String> list) {

		java.util.ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element holding Country: " + iterator.next());
		}
		System.out.println("************************");
	}

}
