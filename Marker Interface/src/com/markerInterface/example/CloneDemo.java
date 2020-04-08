package com.markerInterface.example;

public class CloneDemo implements Cloneable{
	
	/*
	 * clone() method to make fielsd-for-fields copy of instance/object of that
	 * class. 		invoking Object clone() will throw exception if class doen't
	 * implement Cloneable Marker Interface
	 */
	public int integerValue;
	public String stringValue;
	
	public CloneDemo(int integerValue, String stringValue) {
		this.integerValue = integerValue;
		this.stringValue = stringValue;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	

}
