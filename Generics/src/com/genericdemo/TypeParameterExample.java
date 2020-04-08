package com.genericdemo;

/*
 * T - Type
 * E - Element
 * K - Key
 * V - Value
 * N - Number
 * 
 * */

class DataDemo<K, V> {

	private K key;
	private V value;

	public DataDemo(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

	public <E, N> void display(E element, N number) {
		System.out.println("Element : " + element);
		System.out.println("Number : " + number);

	}

}

public class TypeParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataDemo<Integer, String> data = new DataDemo<Integer, String>(1, "Sumit");

		System.out.println("KEY holding : " + data.getKey());
		System.out.println("VALUE holding : " + data.getValue());
		System.out.println("**********************");
		data.display("apun ka element", 25);

	}

}
