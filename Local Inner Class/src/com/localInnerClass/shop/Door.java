package com.localInnerClass.shop;

public class Door {
	
	public boolean isLocked(String key) {
		/* below class is hidden from out side
		 * so it is abstract class*/
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					return false;
				}else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}
	

}
