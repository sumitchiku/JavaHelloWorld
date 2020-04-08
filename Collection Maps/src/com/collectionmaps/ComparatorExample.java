package com.collectionmaps;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Data [ key = " + key + ", value = " + value + " ]";
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* custom sorting we use comparator */
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Set<Data<Integer, String>> setObject = new TreeSet<>(COMPARE_KEY);
		// Set<Data> setObject = new LinkedHashSet<>(); //execute fine
//		setObject.add(new Data<Integer, String>("Key", "Value"));
		setObject.add(new Data<Integer, String>(1, "one"));
		setObject.add(new Data<Integer, String>(6, "six"));
		setObject.add(new Data<Integer, String>(9, "nine"));
		setObject.add(new Data<Integer, String>(3, "three"));
		setObject.add(new Data<Integer, String>(2, "two"));
		setObject.add(new Data<Integer, String>(4, "four"));
		setObject.add(new Data<Integer, String>(5, "five"));
		setObject.add(new Data<Integer, String>(2, "two"));

		for (Data<Integer, String> element : setObject) {
			//System.out.println(element);
		}
		
		/* now Comparator on Name Data
		 * here pass Comprator object in creating object of set in treeset*/
		System.out.println("Name comparator");
		Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		

		Set<Data<Integer, String>> setObject1 = new TreeSet<>(COMPARE_NAME_LENGTH);
		// Set<Data> setObject = new LinkedHashSet<>(); //execute fine
//		setObject.add(new Data<Integer, String>("Key", "Value"));
		setObject1.add(new Data<Integer, String>(1, "SumitSharma"));
		setObject1.add(new Data<Integer, String>(10, "AmanJha"));
		setObject1.add(new Data<Integer, String>(6, "MiaKhalifa"));
		setObject1.add(new Data<Integer, String>(9, "Samar"));
		setObject1.add(new Data<Integer, String>(3, "AkhilAmbala"));
		setObject1.add(new Data<Integer, String>(8, "ArnavRaj"));
		setObject1.add(new Data<Integer, String>(4, "PulomaChakraborty"));
		setObject1.add(new Data<Integer, String>(5, "JishnuK"));
		setObject1.add(new Data<Integer, String>(7, "ZaynMalik"));

		for (Data<Integer, String> element1 : setObject1) {
			System.out.println(element1);
		}

	}

}
