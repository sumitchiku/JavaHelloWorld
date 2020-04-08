package com.Abstractclass;

import com.Abstractclass.person.NonVegan;
import com.Abstractclass.person.Person;
import com.Abstractclass.person.Vegan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("********************");
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();

	}

}
