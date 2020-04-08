package com.collectionExample;

import java.util.ArrayList;

public class ArrayListDemo {

	static ArrayList<String> listName = new ArrayList<>();

	public static void main(String[] args) {
		// Add element in listName list
		listName.add("Sumit");
		listName.add("Sharma");
		listName.add("Puloma");
		listName.add("Chakraborty");
		listName.add("Manisha");
		listName.add("Shreya");
		listName.add("Divya");
		listName.add("Riya");

		// displaying list
		ArrayListDemo app = new ArrayListDemo();
		app.displayList(listName);
		/*
		app.removeNameByIndex(7);
		System.out.println("-------------------");
		app.displayList(listName);
		System.out.println("-------------------");
		System.out.println(listName.get(0));
		System.out.println(listName.get(1));
		app.removeNameByName("Divya");
		System.out.println("-------------------");
		app.displayList(listName);
		*/
		
		System.out.println("********************");
		app.modifyName(1, "Emma");
		System.out.println("%%%%%%%%%%%%%%%%%%%");
		int position = app.search("Chakraborty");
		System.out.println(position);
		if(position != -1) {
			app.modifyName(position, "Hanna");
			app.displayList(listName);
		}else {
			System.out.println("Invalid Entry");
		}
	}

	void removeNameByIndex(int index) {
		listName.remove(index);
	}

	void removeNameByName(String name) {
		listName.remove(name);
	}
	
	void displayList(ArrayList<String> names) {
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	void modifyName(int position, String newName) {
		listName.set(position, newName);
	}
	
	int search(String name) {
		return listName.indexOf(name);
	}

}
