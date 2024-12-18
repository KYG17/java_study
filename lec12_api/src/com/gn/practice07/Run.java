package com.gn.practice07;

public class Run {
	public static void main(String[] args) {


		
//		변수를 선언하고, 실수형 숫자 5.13824를 변수에 초기값으로 셋팅합니다.
		double a = 5.13824;
		
//		그리고 해당 실수를 소수점 첫째자리까지, 둘째자리까지, 셋째자리까지 반올림하여 출력하세요.
		
		double a1 =Math.round(a*Math.pow(10, 1))/ Math.pow(10, 1);
		System.out.println("소수점 첫째자리 : " + a1);
		double a2 = Math.round(a*Math.pow(10, 2))/Math.pow(10, 2);
		System.out.println("소수점 둘째자리 : " + a2);
		double a3 = Math.round(a*Math.pow(10, 3))/Math.pow(10, 3);
		System.out.println("소수점 셋째자리 : " + a3);
	}
//	제곱값 식(pow)을 활용하세요.

}
