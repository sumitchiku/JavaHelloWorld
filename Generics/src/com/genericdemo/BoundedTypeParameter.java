package com.genericdemo;

/* this is anothe way to make Bounded tupe Parameter
 * K extends Integer type making K will accept only Integer
 * V extends UserDefinedClass this make strict userDefinedClass 
 * */

class DataClass<K extends Integer, V extends BoundedTypeParameter> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public DataClass(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "DataClass [key=" + key + ", value=" + value + "]";
	}
	/* One way to making Bounded parameters
	 * Bounded to a paticular Type Generic
	 * E extends Character type making E will accept only Character
	 * N extends Number type making N will accept only Number
	 */
	public <E extends Character, N extends Number> void display(E element, N number) { 
		System.out.println("Elements holding : " + element);
		System.out.println("Number holding : " + number);
	}

}

public class BoundedTypeParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataClass<Integer, BoundedTypeParameter> dataObject = new DataClass<Integer, BoundedTypeParameter>(1, new BoundedTypeParameter());
		dataObject.getValue().test();
		dataObject.display('$', 1.2f);
		
		System.out.println(dataObject.getKey());

	}
	
	public void test() {
		System.out.println("Testing.................");
	}

}
