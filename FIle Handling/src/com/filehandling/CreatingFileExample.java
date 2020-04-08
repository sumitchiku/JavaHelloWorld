package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFileExample {

	public static void main(String[] args) throws IOException {

		/*create file in java*/
		
		File file = new File("abc.txt");	//havent provided path 
		file.createNewFile();		//create folder inside project Folder
		System.out.println("File Created.");
		System.out.println("Refresh the project then able to see file.");
		File file2 = new File("src\\xyz.txt");	//create file inside src folder
		file2.createNewFile();
		
		/*creating directory*/
		File directory = new File("learning");
		directory.mkdir();
		System.out.println("Directory is created.");
		File directories = new File("learning file\\author\\sumit");	//creating folder under folder
		directories.mkdirs();
		System.out.println("Directories is created.");
		File newFile = new File("learning file\\author\\sumit\\test.txt");
		newFile.createNewFile();
		System.out.println("File is created under sumit folder");
		
		
		
	}

}
