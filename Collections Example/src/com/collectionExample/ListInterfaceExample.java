package com.collectionExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Thailand");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Poland");
		countries.add("SriLanka");

		ListInterfaceExample listObject = new ListInterfaceExample();
		listObject.printList(countries);
		System.out.println("for fast operation then LinkList");
		
		
		List<String> demo = new ArrayList<>();
		demo.add("One");
		demo.add("TWo");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		demo.add("Six");
		demo.add("Seven");
		
		listObject.printList(demo);
		System.out.println("Array list are fast for accessing");
		
		

	}

	void printList(List<String> list) {

		for (String element : list) {
			System.out.println("Element holding Country: " + element);
		}
		System.out.println("************************");
	}

}
