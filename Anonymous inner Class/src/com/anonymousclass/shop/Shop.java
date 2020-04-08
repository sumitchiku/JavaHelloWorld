package com.anonymousclass.shop;

import com.anonymousclass.door.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
		door.getLock().test();
		System.out.println("Status : " + door.getLock().isUnlocked("qwerty"));
		System.out.println("***********");
		if(door.getLock().isUnlocked(args[0])) {
			System.out.println("You r Welcome");
		}else {
			System.out.println("CLOSED");
		}
	}

}
