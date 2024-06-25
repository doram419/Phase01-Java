package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요 너비 높이 변수 double형으로 작성
		double rectWidth;
		double rectHeight;
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력하세요 : ");
		rectWidth = sc.nextDouble(); 
		System.out.print("높이를 입력하세요 : ");
		rectHeight = sc.nextDouble(); 
		
		double rectCircum = rectHeight * 2 + rectWidth * 2;
		double rectArea = rectHeight * rectWidth;
		
		System.out.println("사각형의 둘레는 " + rectCircum);
		System.out.println("사각형의 넓이는 " + rectArea);	
		
		sc.close();
	}
}
