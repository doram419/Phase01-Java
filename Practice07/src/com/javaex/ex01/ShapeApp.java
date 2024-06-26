package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");
		// 추상 클래스는 상속 받아서 사용하게 설계된 클래스
		// 추상 클래스 내부 데이터를 사용하고 싶으면 상속 받아서 사용해야하는데
		// 딱히 추상 클래스 내용을 사용하는 출력 결과가 없으니 그냥 삭제
		
		//Circle c1 = new Circle("녹색", 10);
		//Ractangle r1 = new Ractangle("빨강", 4, 4);
		// 안쓰는 코드 과감히 삭제
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		if (sr1 instanceof Ractangle) {
			System.out.println("sr1의 가로는 " + ((Ractangle)sr1).getWidth() + "입니다.");
		}
	}
}

	
	