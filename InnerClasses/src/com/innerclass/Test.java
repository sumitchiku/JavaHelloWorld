package com.innerclass;

import com.innerclass.shop.Door;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();
	}

}
