package com.javaex.ex01;

//회원(Member) 클래스
public class Member {
	// 회원 아이디(id)
	private String id;
	// 회원 이름(name)
	private String name;
	// 회원 멤버쉽 포인트(point)
	private int point;
	
	// 회원의 이름 변경 setName메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// 회원의 이름 반환하는 getName
	public String getName() {
		return name;
	}
	
	// 포인트를 변경하는 setPoint
	public void setPoint(int point) {
		this.point = point;
	}
	
	//포인트를 반환하는 getPoint
	public int getPoint() {
		return point;
	}
	
	// 회원아이디를 변경하는 setId
	public void setId(String id) {
		this.id = id;
	}
	
	// 회원아이디를 반환하는 getId
	public String getId() {
		return id;
	}
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %d%n",
				name, id, point);
	}
}
