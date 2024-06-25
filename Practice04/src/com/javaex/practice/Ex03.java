package com.javaex.practice;

public class Ex03 {
	// [문제] Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.
	public static void main(String[] args) {
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		// 출력값
		// 20
		// 6
		// 10
		// 그냥 레퍼런스구나 혼동스럽네
	}
}
