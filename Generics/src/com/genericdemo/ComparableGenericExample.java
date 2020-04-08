package com.genericdemo;

class DemoDada<T extends Comparable> implements Comparable<T>{
	private T myVariable;

	public DemoDada(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "DemoDada [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T obj) {
		// TODO Auto-generated method stub
		return obj.compareTo(getMyVariable());
	}
	
	
}

public class ComparableGenericExample {

	public static void main(String[] args) {
		
		DemoDada<Integer> dada = new DemoDada<Integer>(1);
		
		System.out.println(dada.compareTo(2));

	}

}
