package com.javaex.practice;

public class Ex01 {
//		[문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
//		확인해 보세요.
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		intArray[3] = 0;
		intArray[4] = 0;
		
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		// 배열의 크기는 5, 즉 4까지 접근이 가능하다.
		// 그래서 이하를 미만으로 바꾸고
		// 3번지와 4번지 배열을 초기화 하지 않고 사용했다.
		// 그래서 둘을 0으로 초기화시켜줬다.
		System.out.println(result);
	}
	
	// 오류 수정 후 예상 출력 결과
	// 22
}
