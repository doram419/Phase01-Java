package com.javaex.ex04;

public class RectTriangle extends Shape{
    private double width;
    private double height;
    
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		super.countSides = 3;
	}

	@Override
	public String toString() {
		return "직각삼각형 [넓이= " + width + ", 높이= " + height + "]";
	}

	@Override
	public double getArea() {
		return width * height / 2.0;
	}

	@Override
	public double getPerimeter() {
		double powedC = 0.0;
		double c = 0.0;
		
		powedC = Math.pow(width, 2) + Math.pow(height, 2);
		c = Math.sqrt(powedC);
		
		return  c;
	}

    
    
}