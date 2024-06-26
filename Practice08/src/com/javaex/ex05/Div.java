package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() { //throw / 0

    	return a / b;
    }

}
