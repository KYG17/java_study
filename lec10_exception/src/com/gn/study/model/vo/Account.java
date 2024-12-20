package com.gn.study.model.vo;

public class Account {
	private String user;
	private int balance;
	
	public Account() {}
	
	public Account(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {//throws로 호출되는 곳에 권한 위임
		if(amount > balance) {
			//throw로 사용자 정의 예외 발생
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance -= amount; // balance = balance - amount;
		System.out.println(amount + "원이 출금됐습니다");
	}

}
