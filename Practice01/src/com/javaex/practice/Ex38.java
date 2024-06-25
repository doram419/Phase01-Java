package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args) {
		//총 금액을 입력하면 백원단위는 할인을 해주고 있습니다 실제 지불금액을 출력하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		int total;
		int bill;
		
		System.out.print("전체 금액을 입력해주세요 : ");
		total = sc.nextInt();
		
		bill = total - total % 1000;
		System.out.println("실제 지불 금액은 " + bill + 
				"입니다.");
		
		sc.close();
	}
}
