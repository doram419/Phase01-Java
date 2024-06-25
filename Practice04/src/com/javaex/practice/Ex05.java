package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
//	[문제] Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		double[] arDatas = new double[5]; 
		double dSum = 0;
		double dAver = 0;
	
		// 5개 입력받기
		for (int i = 0; i < arDatas.length; i++) {
			System.out.printf("숫자%d 입력 : ", 
					i+1);
			arDatas[i] = sc.nextDouble();
			// 평균 계산 위해서 합 더하기
			dSum += arDatas[i];
		}
		
		dAver = dSum / arDatas.length;
		System.out.printf("평균은 %.1f 입니다.", dAver);
		
		// 스캐너 닫기
		sc.close();
	}
}
