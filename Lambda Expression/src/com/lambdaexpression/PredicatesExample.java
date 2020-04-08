package com.lambdaexpression;

import java.util.function.IntPredicate;

public class PredicatesExample {

	public static void main(String[] args) {

		/*
		IntPredicate lessThan18 = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				// TODO Auto-generated method stub
				if (value < 18) {
					return true;
				} else {
					return false;
				}
			}
		};
		*/
		
		IntPredicate lessThan18 = temp->temp<18;
		IntPredicate moreThan10 = i->i>10;
		
		System.out.println(lessThan18.test(12));
		System.out.println(lessThan18.and(moreThan10).test(13));
		System.out.println("OR");
		System.out.println(lessThan18.or(moreThan10).test(45));
		
		System.out.println("***************************");
		System.out.println();
		new PredicatesExample().demo(11, lessThan18, moreThan10);

	}
	
	
	
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
		if (lessThan18.and(moreThan10).test(x)) {
			System.out.println("The Input is less than 18 and more than 10");
		} else {
			System.out.println("Invalid Input");
		}
	}

}
