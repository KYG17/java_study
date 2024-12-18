package com.gn.study.controller;

public class MathRun {

	public static void main(String[] args) {
		//1. abs() : 절대값
		int num = -37;
		num = Math.abs(num);
		System.out.println(num);
		
		//2. pow() : n제곱 구하기
		double dnum = Math.pow(5, 4);
		int result = 1;
		for(int i = 1 ; i <= 4 ; i++) {
			result = result * 5;
		}
		System.out.println(result);
		System.out.println(dnum);
		
		//3. 반올림
		double pi = 3.141592653578;
		//(1) 원하는 자리수만큼 10의 지수 곱하기
		double multi = pi * Math.pow(10,3);
		System.out.println(multi);
		//(2) 반올림 처리 (multi를)
		double half = Math.round(multi);
		System.out.println(half); // 5가 4 보다 큰 숫자여서 올림 처리
		//(3) 10의 지수만큼 나누기
		double div = half / Math.pow(10, 3);
		System.out.println(div);
		//정리
		double after =Math.round(pi*100.0)/100.0; //두번째 자리까지 반올림 ,가로 안 100.0 대신 Math.pow(10,2를) 사용 가능
		System.out.println(after);
		
		//4. 올림
		double up = Math.ceil(pi);
		System.out.println(up);
		
		//5. 내림
		double down = Math.floor(pi);
		System.out.println(down);
		
		// 올림 내림 주의사항
		System.out.println(Math.ceil(1.0/2.0));
		// 소수점 처리 가능
		System.out.println(Math.ceil(pi*Math.pow(10, 2))/Math.pow(10, 2));
		
		

	}

}
