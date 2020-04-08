package inheritanceChild;

import inheritanceParant.Vehicle;

public class Car extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String entertainmentSystem;
	
	public Car() {
		super();
	}

	public Car(String steering, String musicSystem, String airConditioner, String entertainmentSystem, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.entertainmentSystem = entertainmentSystem;
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

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	@Override
	public String toString() {
		return "Car [steering=" + steering + ", musicSystem=" + musicSystem + ", airConditioner=" + airConditioner
				+ ", entertainmentSystem=" + entertainmentSystem + ", getSteering()=" + getSteering()
				+ ", getMusicSystem()=" + getMusicSystem() + ", getAirConditioner()=" + getAirConditioner()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}

		
}
