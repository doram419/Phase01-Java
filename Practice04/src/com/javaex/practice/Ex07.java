package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
//	[문제] Ex07 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
//	동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
	public static void main(String[] args) {
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		int[] wonAmountArray = new int[10];
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 돈의 액수 입력 받기
		int nMoneyAmount = 0;
		
		System.out.print("금액:");
		nMoneyAmount = sc.nextInt();
		int nChange = nMoneyAmount;
		int nCount;
		
		// 돈 -> 권 동전 변환
		for (int i = 0; i < wonArray.length; i++) {
			
			nCount = 0;
			
			if(nChange >= wonArray[i])
			{
				nCount = nChange / wonArray[i];
				nChange = nChange - (wonArray[i] * nCount);
				wonAmountArray[i] = nCount;
			}
		}
		
		// 지폐 / 동전 개수 출력
		for (int i = 0; i < wonAmountArray.length; i++) {
			System.out.printf("%d원 : %d개%n", wonArray[i], wonAmountArray[i]);
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
