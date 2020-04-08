package com.Interface;

import com.Interface.Phone.OnePlus5;
import com.Interface.Phone.Phone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OnePlus5 phone = new OnePlus5();
//		int pro = phone.processor();
//		System.out.println("Processor : " + pro);
		
		Phone phone = new OnePlus5();		//polymorphism
		System.out.println("Processor : " + phone.processor());
		System.out.println("Space : " + phone.spaceInGB() + "GB");
	}

}
