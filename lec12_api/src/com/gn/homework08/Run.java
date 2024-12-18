package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		1) 문제
//	사용자로부터 소수점이 있는 숫자와 10의 제곱수를 입력 받습니다. 
//	입력받은 제곱수만큼 자리수에서 소수점을 반올림하여 출력합니다.
//	2) 출력 예시
//	소수점이 있는 숫자: 3.1415926535
//	10의 제곱수: 4
//	반올림된 결과: 3.1416
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자 : ");
		double a = sc.nextDouble();
		System.out.print("10의 제곱수 : ");
		int b = sc.nextInt();
		double multi = Math.pow(10, b);
		double after = Math.round(a*multi)/multi;
		System.out.println("반올림된 결과 : " + after);
	}

}
