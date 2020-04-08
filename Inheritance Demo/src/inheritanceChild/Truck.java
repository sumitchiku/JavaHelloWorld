package inheritanceChild;

import inheritanceParant.Vehicle;

public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String container;
	
	public Truck(String steering, String musicSystem, String airConditioner, String container, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [steering=" + steering + ", musicSystem=" + musicSystem + ", airConditioner=" + airConditioner
				+ ", container=" + container + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()="
				+ getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
}
