package com.javaex.ex04;

public class Employee extends User{
	int salary;
	
	public Employee() {
		salary = 0;
	}
	
	public Employee (String id, String password,
			String name, int salary) {
		super(id, password, name);
		this.salary = salary * 10000;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, "
				+ "#이름:%s, #월급:%d%n",
				id, password, name, salary);
	}
}
