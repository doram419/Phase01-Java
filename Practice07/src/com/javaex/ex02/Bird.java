package com.javaex.ex02;

public abstract class Bird {
    protected String name;

    public Bird() {
    	name = "이름없음";
	}
    
    public Bird(String name) {
    	this.name = name;
    }
    
    public abstract void fly();
    public abstract void sing();
    public abstract void showName();

	public void setName(String name) {
		this.name = name;
	}
}
