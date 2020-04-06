package com.string.Demo.comparison;

import java.security.PublicKey;

public class StringCompConcat {

	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = new String("Sumit");
	String str4 = new String("Sumit");


	public void comparison() {

		if (str1 == str2) {
			System.out.println(
					"when we execute 'str1 == str2' it matches hashCode \nwhich is created in StringConstantPool not in Heap Area");
		} else {
			System.out.println("Error in (str1 == str2)");
		}
		System.out.println();

		
		if (str3 == str4) {
			System.out.println("this Wont Execute as now it will be allocated in Both heap area and SCP also");

		} else if (str3.equals(str4)) {
			System.out.println(
					"str3.equals(str4) matches HashCodeValue. HashCodeValue from Heap area where object is created");

		} else {
			System.out.println("ComapreMethod is called " + str3.compareTo(str4));

		}
		
	}
	public void concate() {
		String str5 = str1.concat(str3);
		System.out.println("String Concat Output is " + str5);
		System.out.println("subString of Str5 is " + str5.substring(5));
	}

}
