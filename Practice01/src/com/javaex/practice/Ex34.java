package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		//Ex24 사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		double Fahrenheit;
		double Celcius;
		
		System.out.print("화씨 : ");
		Fahrenheit = sc.nextDouble();
		Celcius = (Fahrenheit - 32)*(5.0/9.0);
		System.out.println("화씨 " + Fahrenheit + "의 섭씨 온도는 " + Celcius + "입니다.");
		
		sc.close();
	}
}
