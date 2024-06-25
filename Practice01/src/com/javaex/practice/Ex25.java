package com.javaex.practice;

public class Ex25 {
	public static void main(String[] args) {
//		아래의 출력결과를 예상하여 작성하세요.
//		코드를 작성해서 예상과 맞는지 확인해 보세요
		int a = 13;
		
		System.out.println( (a > 13) && (a >= 13) );		// false
		System.out.println( (a > 13) || (a >= 13) );		// true
		System.out.println( (a / 3 == 4) && (a % 3 == 2) );	// false
		System.out.println( (a / 3 == 4) || (a % 3 == 2) ); // true
		System.out.println( (a / 3 == 4) && (a % 3 == 2) 	// true
				|| ( a / 3 == 4));
		
	}
}
