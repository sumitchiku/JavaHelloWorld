package com.collectionExample;

import java.util.LinkedList;
import java.util.List;

class City {

	private String name;

	public City(String name) {
		this.name = name;
	}

	// tostring to get actual value
	@Override
	public String toString() {
		return name;
	}

}

public class ComparableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> namesValue = new LinkedList<>();
		namesValue.add(new City("Sumit"));
		namesValue.add(new City("Sharma"));
		namesValue.add(new City("Puloma"));
		namesValue.add(new City("Chakraborty"));
		namesValue.add(23);
		namesValue.add(12.0f);
		namesValue.add('a');
		namesValue.add("Any Object Type can be added");

		ComparableExample2 comp = new ComparableExample2();
		comp.printList(namesValue);

	}

	void printList(List<Object> list) { // passing name type Object

		java.util.ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element holding Country: " + iterator.next());
		}
		System.out.println("************************");
	}

}
