package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		// 반지름을 입력 받아 원의 면적을 구하는 프로그램을 작성하세요 파이 값은 3.14로 상수로 지정
		final double PI = 3.14;
		Scanner sca = new Scanner(System.in);
		
		double radius;
		System.out.print("반지름을 입력하세요 : ");
		radius = sca.nextDouble();
		double circleArea = radius * radius * PI;
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + circleArea + "입니다.");
	
		sca.close();
	}
}
