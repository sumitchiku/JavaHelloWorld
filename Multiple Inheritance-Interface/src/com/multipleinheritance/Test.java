package com.multipleinheritance;

import com.multipleinheritance.person.Person;
import com.multipleinheritance.person.Vegan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person john = new Vegan();
		john.breath();
		john.canSee();
		john.eat();
		john.message();

	}

}
