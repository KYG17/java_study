package com.gn.study.controller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		}finally {
			System.out.println("계산 끝!!");
		}
		
		System.out.println("=====NUll 조심 =====");
		
		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());
		}catch(NullPointerException e) {
			System.out.println("오류가 발생!");
		}
//		System.out.println(null.length());
		
		System.out.println("===배열조심===");
		int [] numbers = {1,2,3};
		try {
		System.out.println(numbers[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요");
		}
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		User u = new User();
		try {
			u.checkAge(18);	
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		System.out.println("===============");
		
		try {
		u.nameLength(null);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인");
		
		Account ac = new Account("김철수",1000); // 6. try catch 문으로
		try {
			ac.withdraw(5000);
		}catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
	

		
	}

}
