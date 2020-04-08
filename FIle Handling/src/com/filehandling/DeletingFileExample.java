package com.filehandling;

import java.io.File;

public class DeletingFileExample {

	public static void main(String[] args) {

		File file = new File("abc.txt");
		if (file.delete()) {
			System.out.println("Delete is succussful.");
		} else {
			System.out.println("Error while Deleting.");
		}
	}

}
