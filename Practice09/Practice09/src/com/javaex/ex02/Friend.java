package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    public Friend(String name, String hp, String school) {
    	super();
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    
	@Override
	public String toString() {
		return "Friend [이름: " + name + " 번호: " + hp +
				" 학교: " + school + "]";
	}
}
