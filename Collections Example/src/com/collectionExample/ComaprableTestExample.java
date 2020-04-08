package com.collectionExample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names> {

	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		// TODO Auto-generated method stub
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return 1;
		} else {
			return - 1;
		}
		
	}

	//tostring to get actual value
	@Override
	public String toString() {
		return name;
	}

}

public class ComaprableTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List namesValue = new LinkedList<>();
		namesValue.add(new Names("Sumit"));
		namesValue.add(new Names("Sharma"));
		namesValue.add(new Names("Puloma"));
		namesValue.add(new Names("Chakraborty"));
		
		ComaprableTestExample comp = new ComaprableTestExample();
		comp.printList(namesValue);
		
		Collections.sort(namesValue);
		comp.printList(namesValue);
	}

	void printList(List<Names> list) {		//passing name type Object

		java.util.ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element holding Country: " + iterator.next());
		}
		System.out.println("************************");
	}

}
