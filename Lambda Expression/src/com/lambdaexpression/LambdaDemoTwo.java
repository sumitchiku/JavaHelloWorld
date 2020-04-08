package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface LambdaExp {
	abstract public int demo(int omega);
}

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class LambdaDemoTwo {
	
	static int alpha = 198676;
	int gama = 4567;

	public static void main(String[] args) {

		List<Data> list = new ArrayList<Data>();
		list.add(new Data("Arnav"));
		list.add(new Data("Deepak"));
		list.add(new Data("Mithi"));
		list.add(new Data("Uday"));
		list.add(new Data("Mihir"));
		list.add(new Data("Arti"));
		list.add(new Data("Vinay"));
		list.add(new Data("Abhishek"));

		/*
		 * Collections.sort(list,new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 */

		Collections.sort(list, (Data obj1, Data obj2) -> {
			// return obj1.getName().compareTo(obj2.getName());

			if (obj1.getName().length() < obj2.getName().length()) {
				return -1;
			} else if (obj1.getName().length() > obj2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		});

		for (Data data : list) {
			System.out.println(data.getName());
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		int beta = 10;

		LambdaExp lambda = (int omega) -> {
			int test = 1010245;
			System.out.println("Value of alpha is : " + alpha);
			System.out.println("Value of beta is : " + beta);
			System.out.println("Value of gama is : " + new LambdaDemoTwo().gama);
			System.out.println("Value of test is : " + test);
			System.out.println("Value of Omega is : " + omega);
			return (10 * 4 + 6 - 9 / 7);
		};
		int val = lambda.demo(302);
		System.out.println(val);

	}

}
