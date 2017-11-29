package com.situ.day8;

public enum EnumGender {
	//The constructor EnumGender(String) is undefined
	MALE("男"), FEMALE("女");
	
	private String value;
	
	//Illegal modifier for the enum constructor; only private is permitted.
	private EnumGender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
