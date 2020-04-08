package com.polymorphism;

import com.polymorphism.phone.Nokia;
import com.polymorphism.phone.Phone;
import com.polymorphism.phone.Samsung;

public class Hello {

	public static void main(String[] args) {
//		Phone phone = new Phone("Nokia 3310");
//		System.out.println(phone.getModel());
//		phone.features();
//		
//		SamsungNote8 note = new SamsungNote8("Note 8");
//		System.out.println(note.getModel());
//		note.features();
		
		
//		Phone nokia = new Nokia("Nokia 3310");
		Phone nokia = new Hello().phone(1);
		System.out.println(nokia.getModel());
		nokia.features();
		
		
//		Phone note = new Samsung("Note 8");
		Phone note = new Hello().phone(2);
		System.out.println(note.getModel());
		note.features();
		
	}
	
	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1: return new Nokia("3310");
		case 2: return new Samsung("Note 5");
		}
		return null;
	}

}
