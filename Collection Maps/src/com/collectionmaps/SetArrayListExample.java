package com.collectionmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class City implements Comparable<City> {
	private String city;

	public City(String name) {
		this.city = name;
	}

	public String getName() {
		return city;
	}

	// source --> override hashCode and equal method

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [city= " + city + " ]";
	}

	@Override
	public int compareTo(City obj) {
		return getName().compareTo(obj.getName());
	}

}

public class SetArrayListExample {

	public static void main(String[] args) {

		Set<City> setObject = new HashSet<>();
		setObject.add(new City("Hyderabad"));
		setObject.add(new City("Banglore"));
		setObject.add(new City("Kolkata"));
		setObject.add(new City("Jamshedpur"));
		setObject.add(new City("Mumbai"));
		setObject.add(new City("Delhi"));
		setObject.add(new City("Noida"));
		setObject.add(new City("Pune"));
		setObject.add(new City("Bhopal"));

		System.out.println("Displaying Set Collection Object");
		for (City name : setObject) {
			System.out.println(name);
		}
		System.out.println("*******************************");
		System.out.println();
		List<City> arrayListObject = new ArrayList<>();
		arrayListObject.addAll(setObject);

		Collections.sort(arrayListObject); // sorting collction and as we dataType is userDefined so this line wont
											// work.
		System.out.println("Displaying ArrayList Collection");
		for (City naam : arrayListObject) {
			System.out.println(naam);
		}

		System.out.println();
		System.out.println("Searching Kolkata in arrayList " + Collections.binarySearch(arrayListObject, new City("Kolkata")));

	}

}
