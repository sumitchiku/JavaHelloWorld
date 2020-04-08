package com.multipleinheritance.person;

public abstract class Person implements IsAlive, LiveLife{
	
	public void canSee() {
		System.out.println("This Person can see");
	}
	
	@Override
	public void breath() {
		System.out.println("ya ya person can breath");
	}
	@Override
	public void message() {
		System.out.println("live your life KING size");
	}
	
	public abstract void eat();
}
