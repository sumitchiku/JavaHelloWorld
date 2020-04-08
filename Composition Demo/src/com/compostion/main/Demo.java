package com.compostion.main;

import com.composition.component.Graphics;
import com.composition.component.Processor;
import com.composition.laptop.Laptop;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Laptop lappy = new Laptop();
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());
		System.out.println("**************************");
		System.out.println();
		
//		Laptop gamingLaptop = new Laptop(21f, new Processor("intel", "7200u", 7, 4, 4, "6MB", "2.8GHz", "2.4GHz", "3.8GHz"), "DDR4", "2TB", null, new Graphics("AMD", 4, "4GB"), "backlit");
//		System.out.println(gamingLaptop);
		
		Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6MB", "2.8GHz", "2.4GHz", "3.8GHz");
		Graphics graphicCard = new Graphics("AMD", 4, "4GB");
		
		Laptop gamingLaptop = new Laptop(21f, processor, "DDR4", "2TB", null, graphicCard, "backlit");
		System.out.println(gamingLaptop);
		
		gamingLaptop.gamingMode();
		System.out.println("Current Frequency is : " + gamingLaptop.getProcessor().getCurrFrequency());
	}

}
