package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
//		마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정
		final double kiloExch = 1.609;
		Scanner sc = new Scanner(System.in);
		
		double mile;
		System.out.print("마일을 입력하세요 : ");
		mile = sc.nextDouble();
		
		double kilo = mile * kiloExch;
		System.out.println(mile + "마일은 " + kilo + "킬로미터 입니다.");
		
		sc.close();
	}
}
