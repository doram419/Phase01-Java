package com.javaex.ex02;

public class Duck extends Bird {

	@Override
	public void fly() {
		System.out.printf("오리(%s)가 날지 않습니다.%n", super.name);
	}

	@Override
	public void sing() {
		System.out.printf("오리(%s)가 소리내어 웁니다.%n", super.name);
	}

	@Override
	public void showName() {
		System.out.printf("오리의 이름은 %s입니다.%n", super.name);
	}
}
