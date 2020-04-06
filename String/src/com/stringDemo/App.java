package com.stringDemo;

import java.util.StringTokenizer;

import com.string.Demo.comparison.StringCompConcat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sumit";
		String lastName = "Sharma";
		String fullName = firstName.concat(lastName);

		fullName = fullName.replace("SumitSharma", "Sumit Kumar Sharma");

		System.out.println(fullName);
		System.out.println("***************");

//		if (fullName == "SumitSharma") {
//			System.out.println("fullName is correct");
//		} else {
//			System.out.println("Not Matching"); //this will execute
//		}

		if (fullName.equals("SumitSharma")) {
			System.out.println("fullName is Incomplete");
		} else if (fullName.equals("Sumit Kumar Sharma")) {
			System.out.println("fullName is Correct");
		} else {
			System.out.println("Not Matching");
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		StringCompConcat sComp = new StringCompConcat();
		sComp.comparison();
		sComp.concate();

		System.out.println("!@#$%^&************STRING BUFFER************!@#$%^&*(");
		StringBuffer sbf = new StringBuffer(firstName);
		sbf.append(" is my ").append("First name ");
		System.out.println("Using append keyWord " + sbf);
		System.out.println("Using insert keyWord " + sbf.insert(5, lastName));
		System.out.println("Using replace keyWord " + sbf.replace(5, 11, "Kumar"));
		System.out.println("Using delete keyWord " + sbf.delete(5, 10));
		System.out.println("Using reverse keyWord " + sbf.reverse());

		long startTime = System.currentTimeMillis();
		System.out.println("!@#$%^&************STRING BUILDER************!@#$%^&*(");
		StringBuilder sbd = new StringBuilder("Java");
		for (int i = 0; i < 1000; i++) {
			sbd.append("WORLD");
		}
		System.out.println("Time Taken by String Builder is : " + (System.currentTimeMillis() - startTime) + "ms");
		
		long startTimes = System.currentTimeMillis();
		StringBuffer bufferd = new StringBuffer("Batman");
		for (int i = 0; i < 1000; i++) {
			bufferd.append("Superman");
		}
		System.out.println("Time Taken by String Buffer is : " + (System.currentTimeMillis() - startTimes) + "ms");
		
		System.out.println("_____________String Tokenizer__________");
		StringTokenizer stringToken = new StringTokenizer("My name is sumit sharma");
		while(stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}
		
	}

}
