package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		//상품을 구매하면 정가의 10% 를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		double cash;
		double salesPrice;
		double tax;
		double balance;
		
		System.out.print("상품가격 : ");
		salesPrice = sc.nextDouble();
		System.out.print("받은 돈 : ");
		cash = sc.nextDouble();
		
		tax = salesPrice * 0.1;
		balance = cash - salesPrice;
		
		System.out.println("=====================");
		System.out.println("받은 돈 : " + cash);
		System.out.println("상품가격 : " + salesPrice);
		System.out.println("부가세 : " + tax);
		System.out.println("잔액 : " + balance);
		
		sc.close();
	}
}
