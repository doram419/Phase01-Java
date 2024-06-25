package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {
//		long형 변수를 사용하여 빛이 11년동안 진행하는 거리를 계산하여 출력하세요
//		단 빛의 속도는 300000 km/s 로 계산한다
		Scanner sc = new Scanner(System.in);
		final long lightSpeed = 300_0000;
		long yearSecond = 31_557_600;
		long distance = lightSpeed * yearSecond;
		
		System.out.println("빛이 1년동안 가는 거리는 " + distance + "km입니다.");
		
		sc.close();
	}
}
