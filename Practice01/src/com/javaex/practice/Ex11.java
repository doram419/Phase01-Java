package com.javaex.practice;

public class Ex11 {
//	아래의 코드에서 오류가 발생하는 부분을 예상하고 수정하세요
//	public static void main(String[] args) {
//		int iVar = 10;
//		long lVar = 1000000000000L;
//		char cVar = 'ab';
//		double dVar = 10;
//		float fVar = 12.4f;
//		String str = 'ab';
//	}
	
	public static void main(String[] args) {
		int iVar = 10;
		long lVar = 1000000000000L;
//		char cVar = 'ab';
		char cVar1 = 'a';
		char cVar2 = 'b';
		// char는 문자 1개만 저장할 수 있으므로,
		// 2개의 문자를 저장하고 싶다면 2개의 변수로 만들어야 한다.
		double dVar = 10;
		float fVar = 12.4f;
//		String str = 'ab';
		String str = "ab";
		// String으로 저장하고 싶다면 ' '가 아닌 " "로 저장해야 한다.
		
		// warnings 없애기용
		System.out.println(iVar + lVar + cVar1 + cVar2 + dVar + fVar + str);
	}
}
