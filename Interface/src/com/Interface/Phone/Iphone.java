package com.Interface.Phone;

public class Iphone implements Phone{

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String os() {
		return "iOS";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
