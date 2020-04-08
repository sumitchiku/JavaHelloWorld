package com.genericdemo;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleID;

	public Vehicle(int vehicleID) {
		super();
		this.vehicleID = vehicleID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + "]";
	}
	
	void info(){
		System.out.println("Vehicle id is : " + getVehicleID());
	}
	
}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleID, String carModel) {
		super(vehicleID);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	
	@Override
	void info(){
		System.out.println("Car model is : " + getCarModel());
	}

}

public class WildcardsExample {

	public static void main(String[] args) {
		
//		Vehicle demo = new Vehicle(123, "Honda")
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(123));
		list.add(new Vehicle(234));
		list.add(new Vehicle(345));
		list.add(new Vehicle(456));
		list.add(new Vehicle(123));
		list.add(new Car(123, "Honda"));
		list.add(new Car(234, "Audi"));
		list.add(new Car(345, "BMW"));
		list.add(new Car(456, "Mercedes"));
		list.add(new Car(123, "Tesla"));
//		list.add(new String("A string object"));
		display(list);
	}
	
	public static void display(List<? extends Vehicle> list) {
		for(Vehicle element : list) {
			element.info();
		}
	}
	
//	public static void display(List<? super Car> list) {
//		for(Object element : list) {
//			((Vehicle) element).info();
//		}
//	}

}
