package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {
//	[문제] Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문
//	을 작성하세요.
	public static void main(String[] args) {
		double arInt[] = new double[3];
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		for (int i = 0; i < arInt.length; i++) {
			arInt[i] = sc.nextDouble();
		}
		
		for (int i = arInt.length-1; 
				i >= 0; i--) {
			System.out.println(arInt[i]);
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
