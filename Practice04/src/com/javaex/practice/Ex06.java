package com.javaex.practice;

public class Ex06 {
	// [문제] Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == ' ')
				System.out.print(",");
			else
				System.out.print(c[i]);
		}
	}
}
