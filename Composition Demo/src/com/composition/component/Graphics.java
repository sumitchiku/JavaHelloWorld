package com.composition.component;

public class Graphics {
	private String brand;
	private int series;
	private String memory;
	
	
	public Graphics() {
//		super();
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}


	public Graphics(String brand, int series, String memory) {
//		super();
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}


	@Override
	public String toString() {
		return "Graphics \n [brand = " + brand + ",\n series = " + series + ",\n memory = " + memory + ",\n getClass() = " 
				+ getClass() + ",\n hashCode() = " + hashCode() + "]";
	}


	public String getMemory() {
		return memory;
	}
	
	
	
	
	
	

}
