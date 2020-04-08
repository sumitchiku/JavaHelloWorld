package inheritanceChild;

import inheritanceParant.Vehicle;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		/*it should be 1to1 correspondence (method signature) to parent constructor and pass value of parent*/
		super(engine, wheels, seats, fuelTank, lights );					//calling parameter constructor from parent class
		this.handle = handle;		//already we are setting value, no need setters
	}

	public String getHandle() {
		return handle;
	}
	
	/*generate toString so that at time calling only object 
	 * it will display packageName+ClassName+@hashCode
	 * and if we want to see value of each property then
	 * override toString method and display your custom display*/

	@Override
	public String toString() {	//
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running Bike");
		System.out.println(toString());
	}
	
	
}
