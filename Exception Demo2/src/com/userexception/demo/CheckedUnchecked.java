package com.userexception.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUnchecked {
	
	public void someExtraMethod() {
		
		try {
			FileReader fr = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
