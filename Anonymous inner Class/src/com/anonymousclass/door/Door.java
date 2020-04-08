package com.anonymousclass.door;

/*in one package there will be only one public class, 
we cant have more then 1 public class so eclips will start complaning about it
how we can achive-> keeping all (Door,Shop)class in same packkage, OR create new abstract
class(LOCK)*/

/*abstract class Lock{
	public abstract boolean isUnlocked(String keyCode);
	
	public void test() {
		System.out.println("Test");
	}
}*/

public class Door {
	Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {

			if(keyCode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}
	
}
