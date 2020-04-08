package com.composition.laptop;

import com.composition.component.Graphics;
import com.composition.component.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private String opticalDrive;
	private Graphics graphicCard;
	private String keyboard;
	
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "1TB";
		this.opticalDrive = "Multi-Layer";
		this.graphicCard = new Graphics();
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, String opticalDrive,
			Graphics graphicCard, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.opticalDrive = opticalDrive;
		this.graphicCard = graphicCard;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop \n [screen = " + screen + ",\n processor = " + processor + ",\n ram = " + ram + ",\n hardDrive = " 
				+ hardDrive + ",\n opticalDrive = " + opticalDrive + ",\n graphicCard = " + graphicCard + ",\n keyboard = "
				+ keyboard + ",\n getClass() = " + getClass() + ",\n hashCode() = " + hashCode() + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

	public Graphics getGraphicCard() {
		return graphicCard;
	}
	
	
	 public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public String gamingMode() { 
		System.out.println("Gaming Mode is ON");
		processor.setCurrFrequency(processor.getMaxFrequency());
		return "Success";
	 }
	 
	
	
	

}
