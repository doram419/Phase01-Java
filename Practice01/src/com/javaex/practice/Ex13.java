package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		//다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		System.out.println(13/5);					//(1)
		System.out.println((double)13/5);			//(2)
		System.out.println(13/(double)5);			//(3)
		System.out.println((double)13/(double)5);	//(4)
		System.out.println(13.0/5);					//(5)
		System.out.println(13/5.0);					//(6)
		System.out.println((double)(13/5));			//(7)
		
		//답 (1) 다른 건 실수 형이지만 이것은 정수끼리의 계산이라 소숫자리가 없다
		// (7) 이건 실수형으로 캐스팅 되지만, 계산이 끝난 뒤에 변경되서 소숫점 유실이 발생한다.
	}

}
