package com.collectionmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Hash Map*/

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Ram");
		student.put(4, "Puloma");
		student.put(22, "Sumit");
		student.put(7, "Dhoni");
		student.put(3, "Teza");
		student.put(11, "Reddy");
		
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			//System.out.println(entry);
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		System.out.println(student.get(22));
		System.out.println("********************");
		
		
		for(Integer key : student.keySet()) {
			System.out.println("Key holds : \"" + key + "\" and Value holds \"" + student.get(key) + "\"");
		}
		
		System.out.println("######################");
		System.out.println("Displaying Entry using iterator");
		Iterator<Entry<Integer,String>> entry = student.entrySet().iterator();
		
		while(entry.hasNext()) {
//			System.out.println(entry.next());
			Entry<Integer,String> tempEntry = entry.next();
			System.out.println("Key holds : '" + tempEntry.getKey() + "' and Value holds '" + tempEntry.getValue() + "'");
		}
	}

}
