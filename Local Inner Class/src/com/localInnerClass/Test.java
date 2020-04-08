package com.localInnerClass;

import com.localInnerClass.shop.Door;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
//		System.out.println(door.isLocked("test"));
		if (door.isLocked(args[0])) {	//dropdown beside run->configuration and 2nd tab pass agruments
			System.out.println("Shop has been closed");
		}else {
			System.out.println("Hi!!! Welcome");
		}
	}

}
