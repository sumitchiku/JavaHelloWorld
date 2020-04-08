package com.enumDemo;

public class App {
	
	public static void main(String[] args) {

//		Enumration numb = null;
		Enumration numb = Enumration.CONSTANT1;
		switch(numb) {
		case CONSTANT1:
			System.out.println(" Printing Contant1 value....");
			break;
		case CONSTANT2:
			System.out.println(" Printing Contant2 value....");
			break;
		case CONSTANT3:
			System.out.println(" Printing Contant3 value....");
			break;
		case CONSTANT4:
			System.out.println(" Printing Contant4 value....");
			break;
		case CONSTANT5:
			System.out.println(" Printing Contant5 value....");
			break;
		default:
			System.out.println(" Printing Default value....");
			break;
		
		}
	}

}
