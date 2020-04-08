package com.anonymousclass.door;

public abstract class Lock {
	public abstract boolean isUnlocked(String keyCode);
	
	public void test() {
		System.out.println("Test");
	}
}
