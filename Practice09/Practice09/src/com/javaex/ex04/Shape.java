package com.javaex.ex04;

public abstract class Shape {
	double countSides;		// 변의 수
	
	public double getCountSides() {
		return countSides;
	}
    
    public abstract double getArea(); // 넓이

    public abstract double getPerimeter(); // 둘레 길이
}
