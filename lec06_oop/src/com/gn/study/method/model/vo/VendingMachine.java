package com.gn.study.method.model.vo;

public class VendingMachine {
	// 1. 인사 <반환형 x>
	public void sayHi() {        // -> 메소드의 선언부
		System.out.println("환영합니다~");
	} 
	// 2. 남아있는 잔돈(기본형) 리턴
	public int getBalance() {
		int balance =500;
		return balance;
//		return 500;    // return 값을 반드시 작성
	}
	// 3. 음료수 종류(배열) 리턴
	public String[] sodaList() {
		String[] arr = new String[] {"콜라", "사이다", "오렌지주스"};
		return arr;
//		return new String[] {"콜라", "사이다", "오렌지주스"};
	}
	//Soda s1 = new Soda();
	// 4. 선택된 음료수 객체(클래스) 리턴
	public Soda SelectedSoda() {
//		Soda s1 = new Soda();
//		return s1;
		return new Soda();
	}
	

}
