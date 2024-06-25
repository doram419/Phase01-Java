package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		//사용자로부터 밑변 높이 값을 입력 받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		double height;
		double width;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		width = sc.nextDouble();
		System.out.print("세로 : ");
		height = sc.nextDouble();
		area = width * height * 0.5;
		System.out.println("삼각형의 넓이는 " + area + "입니다.");
		
		sc.close();
	}
}
