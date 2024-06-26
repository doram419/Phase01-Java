package com.javaex.ex02;

public class Sparrow extends Bird {
	@Override
	public void fly() {
		System.out.printf("참새(%s)가 날아 다닙니다.%n", super.name);
	} 
	@Override
	public void sing() {
		System.out.printf("참새(%s)가 소리내어 웁니다.%n", super.name);
	}

	@Override
	public void showName() {
		System.out.printf("참새의 이름은 %s입니다.%n", super.name);
	}
}
