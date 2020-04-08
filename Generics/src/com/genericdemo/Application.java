package com.genericdemo;

import java.util.LinkedList;
import java.util.List;

class Data {

	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return (String) obj;
	}

}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Data data = new Data("Sumit sharma"); String variable = (String)
		 * data.getObj(); System.out.println(variable);
		 */

		GenericClass<String> genericObject = new GenericClass<String>("SomeData");
		String data = genericObject.getData();
		System.out.println(data);
		System.out.println("##################");

		List<GenericClass<Object>> elements = new LinkedList<>();
		elements.add(new GenericClass<Object>("Some Text String Value"));
		elements.add(new GenericClass<Object>(1.0));
		elements.add(new GenericClass<Object>(512));
		elements.add(new GenericClass<Object>('S'));
		elements.add(new GenericClass<Object>(1.9f));

		Application gen = new Application();
		gen.printList(elements);

	}

	void printList(List<GenericClass<Object>> elements) {

		java.util.ListIterator<GenericClass<Object>> iterator = elements.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element holding Country: " + iterator.next().getData());
		}
		System.out.println("************************");
	}

}
