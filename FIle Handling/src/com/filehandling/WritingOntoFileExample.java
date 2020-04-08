package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingOntoFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("writing into files");
		file.mkdir();

		file = new File("writing into files\\team.txt");
		try {
			file.createNewFile();
			System.out.println("File Created.");
		} catch (IOException e) {
			System.out.println("Error Occurr while creating File.");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) { // true in parameter is sign that new
																					// content will append to previous
																					// data in file

			bw.write("Hello this text written from Java Application.");
			bw.newLine();
			bw.write("We can write onto team file from java application");
			bw.newLine();
			bw.write("with the help of BufferWriter. This will overwrite all content in file.");
			bw.close();
		
		} catch (Exception e) {
			System.out.println("Error Occurr while writting onto File.");
		}

	}

}
