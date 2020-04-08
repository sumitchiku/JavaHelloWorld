package com.markerInterface.example;

import java.io.Serializable;

import javax.xml.crypto.Data;

public class SerializableDemo implements Serializable {

	public int intValue;
	public String strValue;

	public SerializableDemo(int intValue, String strValue) {
		this.intValue = intValue;
		this.strValue = strValue;
	}

	// transient(variables modifier) :- At the time of serialization, if we don’t
	// want to
	// save value of a particular variable in a file, then we use transient keyword

	/*
	 * // A sample class that uses transient keyword to // skip their serialization.
	 * class Test implements Serializable { // Making password transient for
	 * security private transient String password;
	 * 
	 * // Making age transient as age is auto- // computable from DOB and current
	 * date. transient int age;
	 * 
	 * // serialize other fields private String username, email; Date dob;
	 * 
	 * // other code }
	 */

	/*
	 * class Test implements Serializable { // Normal variables int i = 10, j = 20;
	 * 
	 * // Transient variables transient int k = 30;
	 * 
	 * // Use of transient has no impact here transient static int l = 40; transient
	 * final int m = 50;
	 * 
	 * public static void main(String[] args) throws Exception { Test input = new
	 * Test();
	 * 
	 * // serialization FileOutputStream fos = new FileOutputStream("abc.txt");
	 * ObjectOutputStream oos = new ObjectOutputStream(fos); oos.writeObject(input);
	 * 
	 * // de-serialization FileInputStream fis = new FileInputStream("abc.txt");
	 * ObjectInputStream ois = new ObjectInputStream(fis); Test output =
	 * (Test)ois.readObject(); System.out.println("i = " + output.i);
	 * System.out.println("j = " + output.j); System.out.println("k = " + output.k);
	 * System.out.println("l = " + output.l); System.out.println("m = " + output.m);
	 * } }
	 */

}
