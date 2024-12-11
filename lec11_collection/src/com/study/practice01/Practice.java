package com.study.practice01;

public class Practice {
//	1) 문제
//	com.gn.practice01패키지에 Run과 Practice 클래스를 구성하세요.
//	Run은 실행 클래스, Practice는 기능 클래스 입니다.
//	Practice 클래스에는 printSum 메소드가 있습니다.
//	리턴 : 없음
//	매개변수 : 문자열 2개
	
	public void printsum(String a, String b) {	
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
//		int sum = num1+num2;
		System.out.println("합 : "+ (num1+num2));

	}

}
