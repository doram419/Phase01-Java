package com.javaex.ex08;

public class Account {
	private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    	System.out.println(accountNo + " 계좌가 개설되었습니다.");
    }
    
    //필요한 메소드 작성
    public void deposit(int nValue) {
    	balance += nValue;
	}
    
    public void withdraw(int nValue) {
    	balance -= nValue;
	}
    
    public void showBalance() {
    	System.out.println(balance);
	}
}
