package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader br = new BufferedReader(new FileReader("writing into files\\team.txt"));
			
			String line;		//IOException
			while((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		
		
		System.out.println("\n\n\tReading Files using Sacnner Class");
		try {
			Scanner sc = new Scanner(new File("src\\xyz.txt"));
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file");
		}
	}

}
