package com.collectionExample;

import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Thailand");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Poland");
		countries.add("SriLanka");
		
		LinkListExample listObject = new LinkListExample();
		
		listObject.printList(countries);
		countries.add(2, "China");
		listObject.printList(countries);
		countries.set(7, "Sri Lanka");
		listObject.printList(countries);
//		countries.remove(); // first elements will be removed
		countries.remove(5);
		listObject.printList(countries);
		
	}
	
	void printList(List<String> countries) {
		
		for(String element : countries) {
			System.out.println("Element holding Country: " + element);
		}
		System.out.println("************************");
	}

}
