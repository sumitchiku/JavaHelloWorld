package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationReadExample {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("learning\\Vehicle")) {
			try (ObjectInputStream objIS = new ObjectInputStream(fis)) {

				Vehicle v1 = (Vehicle) objIS.readObject();
				Vehicle v2 = (Vehicle) objIS.readObject();
				
				System.out.println("Object 1 Value: " + v1);
				System.out.println("Object 2 value: " + v2);

			} catch (ClassNotFoundException e) {
				System.out.println("Class not found Exception.");
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not Found while writing into file");
		} catch (IOException e) {
			System.out.println("Error occure while reading file.");
		}

	}

}
