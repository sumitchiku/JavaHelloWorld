package com.exception.multicatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsAndThrow {
	public void someMethod() throws FileNotFoundException {
		FileReader in = new FileReader("file.txt");
		System.out.println("Hello from someMethod");
	}
	public void someMoreMethod() throws FileNotFoundException {
		System.out.println("Hello from someMoreMethod");
		throw new FileNotFoundException();
//		System.out.println("Hello from someMoreMethod"); // this line not executed
	}

}
