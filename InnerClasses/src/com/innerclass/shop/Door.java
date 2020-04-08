package com.innerclass.shop;

public class Door {
	
	private Lock lock;
	
	public Door(){
		lock = new Lock(true);
	}
	
	public Lock getLock() {
		return lock;
	}

	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is CLOSED");
		}else {
			System.out.println("WELCOME");
		}
	}
	
	public class Lock{
		private boolean lock;

		public Lock(boolean lock) {
			super();
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}

}
