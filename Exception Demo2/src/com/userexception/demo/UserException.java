package com.userexception.demo;

import java.io.FileNotFoundException;

public class UserException {

	public void userException() throws Exception, FileNotFoundException, UserDefinedException {
		int x = 3;

		switch (x) {
			case 1:
				throw new FileNotFoundException();
			case 2:
				throw new Exception();
			default:
				throw new UserDefinedException();		

		}

	}

}
