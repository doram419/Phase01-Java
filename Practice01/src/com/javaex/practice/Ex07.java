package com.javaex.practice;

public class Ex07 {
// 다음 코드에서 변수로 사용할 수 없는 경우 이유를 작성하세요.
// 예시 코드 ---------------------------------
//	public static void main(String[] args) {
//		int true;
//		int #_of_workers;
//		int countOfLettersInString;
//		int 1stLevel;
//		int person#;
//		int _person;	
//	}
// 예시 코드 종료 ---------------------------------
	
	public static void main(String[] args) {
//		int true;
		int trueInt;
		//int와 true 모두 사용자가 사용할 수 없는 예약어이다.
		//그래서 true로는 이름을 지을 수 없고, 다른 이름으로 만들었다.
		
//		int #_of_workers;
		int of_workers;
		//변수 이름은 #로 시작할 수 없다.
		
		int countOfLettersInString;
//		int 1stLevel;
		int firstLevel;
		// 변수 이름은 숫자로 시작할 수 없다. 의미가 비슷한 다른 이름으로 지었다.
//		int person#;
		int person;
		//변수 이름은 #를 쓸 수 없다.  
		int _person;	
		
		
		// warnings 없애기용
		trueInt = 0;
		of_workers = 0;
		countOfLettersInString = 0;
		firstLevel = 0;
		person = 0;
		_person = 0;
		System.out.println(trueInt + of_workers + countOfLettersInString + firstLevel + person + _person);
	}

}
