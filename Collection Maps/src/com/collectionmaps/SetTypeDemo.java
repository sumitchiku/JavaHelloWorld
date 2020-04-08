package com.collectionmaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> demoSet = new TreeSet<>();
		for (int i = 30; i > 0; i--) {
			demoSet.add(i);
		}

		System.out.println("Printing Data in set");

		for (Integer j : demoSet) {
			System.out.println(j);
		}

		System.out.println("Set Operation on Integer is Over");

//		Set<String> demoStr = new TreeSet<>();		//sorted on number
//		Set<String> demoStr = new LinkedHashSet<>();	//order way
		Set<String> demoStr = new HashSet<>();		//	jumbeled
		for (int i = 30; i > 0; i--) {
			demoStr.add("A" + i);
		}

		System.out.println("Printing Data in set");

		for (String j : demoStr) {
			System.out.println(j);
		}

	}

}
