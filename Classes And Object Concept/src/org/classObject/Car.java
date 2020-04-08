package org.classObject;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;		//access specifire is private means variable can not be modified outside of the class
	
	//another way to initillize value of class property is constructor(right click source  generate construstor)
	public Car() {
		doors = "Opened";
		engine = "Off";
		driver = "Absent";
		speed = 0;
	}
	
	
	public Car(String doors, String engine, String driver, int speed) {
//		super();		//overloading parent class constructor 
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}


	//example of POJO plain old java object
	//setter and getter to acess speed
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	// to generate setter and getters rightClick->source->generate setter and getter
	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	///adding functionallity for a car these are method
	public String run() {
		if(doors.equals("Closed") && engine.equals("On") && 
				driver.equals("Seated") && speed > 0) {
			return "Running";
		}
		else  
			return "Not Running";
	}
	
	
}
