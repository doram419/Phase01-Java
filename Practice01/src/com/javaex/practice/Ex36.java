package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		// 동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		int fiveHW;
		int oneHW;
		int fiftyW;
		int tenW;
		int sum;
		
		System.out.print("500원 개수 : ");
		fiveHW = sc.nextInt();
		System.out.print("100원 개수 : ");
		oneHW = sc.nextInt();
		System.out.print("50원 개수 : ");
		fiftyW = sc.nextInt();
		System.out.print("10원 개수 : ");
		tenW = sc.nextInt();
		
		sum = fiveHW * 500 + oneHW * 100 + fiftyW * 50 + tenW * 10;
		System.out.println("동전의 총 합은 " + sum + " 원입니다.");
		
		sc.close();
	}
}
