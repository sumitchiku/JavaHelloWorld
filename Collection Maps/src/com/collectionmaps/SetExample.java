package com.collectionmaps;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> cities = new HashSet<String>();
		cities.add("Jamshedpur");
		cities.add("Kolkata");
		cities.add("Hyderabad");
		cities.add("Banglore");
		cities.add("Delhi");
		cities.add("Kolkata");		//no Duplicate data in set

		for (String city : cities) {
			System.out.println(city);
		}
		
		System.out.println(cities.contains("Jamshedpur"));

	}

}
