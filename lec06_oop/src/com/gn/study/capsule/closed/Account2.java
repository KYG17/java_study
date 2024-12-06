package com.gn.study.capsule.closed;


//getter, setter 사용 o
public class Account2 {
	private String user;
	private int balance;
	
	//기본 생성자
	public Account2() {}
	
	
	//매개변수 생성자
	public Account2(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	
	//getter -> 캡슐안에 있는 애를 꺼냄 return!
	public String getUser() {
		return user;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//setter -> 안에 넣어줌, 변환형 없음
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setBalance(int balance) {
		if(balance<0) {
			System.out.println("출금이 불가능합니다.");
		}else {
		this.balance = balance;
		}
	}

}
