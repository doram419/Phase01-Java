package com.javaex.ex01;

public class Customer extends Person{
	int cNo;
	int point;
	
	public Customer(String name, String hp,
			int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#이름:%s, #핸드폰:%s,"
				+ " #고객번호:%d, #포인트점수:%d%n",
				super.name, super.hp,
				cNo, point);
	}
}
