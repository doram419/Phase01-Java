package com.javaex.ex02;

public class Triangle extends Shape{
	private int width;
	private int height;

	// 명시하지 않아도 부모클래스 생성자 호출됨
	public Triangle() {
		super();	// 그래도 명시할래
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}

	public Triangle(String fillColor, String lineColor,
			int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
	
}


