package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		//월급을 입력 받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요
		//월급 받기
		Scanner sc = new Scanner(System.in);
		int money;
		money = sc.nextInt();
		money *= 120;
	
		// *12개월
		// *10년
		System.out.println("10년동안 최대 저축액은 " + money + "원 입니다.");
		
		sc.close();
	}

}
