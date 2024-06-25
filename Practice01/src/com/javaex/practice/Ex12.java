package com.javaex.practice;

public class Ex12 {
//	다음코드의 잘못된 부분을 찾아서 수정해 보세요
//	코드를 작성해서 오류가 없도록 변경해 보세요
//	public static void main(String[] args) {
//		int x, y = 0;
//		char grade = "A";
//		int salary = 2,000,000;
//		byte n = 1000;
//		
//	}
	
	public static void main(String[] args) {
		int x, y = 0;
//		char grade = "A";
		char grade = 'A';
		//char는 " "가 아닌 ' '를 사용해야 함
//		int salary = 2,000,000;
		int salary = 2_000_000;
		//프로그래밍 코딩을 할 때에는 자연어를 쓸 때처럼
		//숫자 사이에 ','를 쓸 수는 없다. 
		//대신 3번째마다 _를 사용하여 숫자를 구분할수 있다.
		int n = 1000;
		//byte는 1byte이기 때문에 1000을 대입 할 수 없다.
		//정수 1000을 넣으려면 2^5이상을 지원해주는 정수형에 넣어줘야 한다.
		
		//warnings 없애기용
		x = 0;
		System.out.println(x + y + grade + salary + n);
	}
}
