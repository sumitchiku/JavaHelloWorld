package inheritanceChild;

public class Tempoo extends Truck{
	private String uses;

	public Tempoo(String steering, String musicSystem, String airConditioner, String container, String engine,
			int wheels, int seats, int fuelTank, String lights, String uses) {
		super(steering, musicSystem, airConditioner, container, engine, wheels, seats, fuelTank, lights);
		this.uses = uses;
	}

	public String showData() {
		return "Tempoo [ It uses for = " + uses + ",\n getSteering() = " + getSteering() + ",\n getMusicSystem() = " 
				+ getMusicSystem() + ",\n getAirConditioner() = " + getAirConditioner() + ",\n getContainer() = " 
				+ getContainer() + ",\n getEngine() = " + getEngine() + ",\n getWheels() = " + getWheels()
				+ ",\n getSeats() = " + getSeats() + ",\n getFuelTank() = " + getFuelTank() + ",\n getLights() = " 
				+ getLights() + ",\n hashCode() = " + hashCode() + "]";
	}
	
}
