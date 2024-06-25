package com.javaex.practice;

public class Ex17 {
	public static void main(String[] args) {
//		다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요
//		int x, y
//		
//		x = 10
//		y = 20
//		
//		sum = x + y
//		
//		System.out.println("합은 ' + sum);
		
		int x, y;
		x = 10;
		y = 20;
		//15~18 세미콜론 없음
		
		int sum;
		sum = x + y;
		// 세미콜론 없음. sum 정의되지 않음
		
		System.out.println("합은 " + sum);
		//문자열 출력시 " " 사용해야함
	}
}
