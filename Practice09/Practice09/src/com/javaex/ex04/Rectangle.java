package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		super.countSides = 3;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		double area = (width * 2) + (height * 2);
		
		return area;
	}
	
	@Override
	public String toString() {
		return "사각형 [넓이= " + width + ", 높이= " + height + "]";
	}
	

    
}