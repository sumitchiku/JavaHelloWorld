package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehicle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8952034586215410034L;
	private String type;
	private int number;

	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}

}

public class SerilizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Vehicle("Bike", 123456);
		Vehicle car = new Vehicle("Car", 654123);
		
		try(FileOutputStream fos = new FileOutputStream("learning\\Vehicle")){
			
			try(ObjectOutputStream obj =  new ObjectOutputStream(fos)) {
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written on file.");
			} 
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		
		
		

	}

}
