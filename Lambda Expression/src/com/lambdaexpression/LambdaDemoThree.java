package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

class CityDemo{
	private String name;

	public CityDemo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "DataDemo [name=" + name + "]";
	}
	
	
	
}

public class LambdaDemoThree {

	public static void main(String[] args) {


		List<CityDemo> list = new ArrayList<>();
		list.add(new CityDemo("Noida"));
		list.add(new CityDemo("Hyderabad"));
		list.add(new CityDemo("Banglore"));
		list.add(new CityDemo("Kolkata"));
		list.add(new CityDemo("Jamshedpur"));
		list.add(new CityDemo("Pune"));
		list.add(new CityDemo("Delhi"));
		
		
		/*
		for (Integer integer : list) { if(integer >= 10) {System.out.println(integer);}}
		*/
		
		list.forEach(temp -> {
				System.out.println(temp.getName());
		});

	}

}
