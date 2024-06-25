package com.javaex.practice;

public class Ex24 {
//	다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다
//	결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요
	public static void main(String[] args) {
		double f = 80.0;
//		System.out.println(5 / 9 * (f-32.0) );
		//정수끼리의 계산에서 소숫점이 나오지 않기에, 5/9의 값은 0이다.
		//그래서 0과 뭘 곱해도 0이 나온다.
		System.out.println(5.0 / 9.0 * (f-32.0) );
	}
}
