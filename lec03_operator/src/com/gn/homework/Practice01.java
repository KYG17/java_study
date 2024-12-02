package com.gn.homework;

import java.util.Scanner;

public class Practice01 {

public static void main(String[] args) {

//	=== 놀이동상 입장료 계산하기===

//			나이 : 35

//			당신의 놀이동산 요금은 30000원입니다.

	

	Scanner sc = new Scanner(System.in);

	System.out.println("===놀이동산 입장료 계산하기===");

	System.out.print("나이: ");

	int a = sc.nextInt();

	String b;

	if (a < 3) {

//		System.out.println("무료");

		b = "무료";

	}else if(a >= 3 && a <=12){

//		System.out.println("10000원");

		b = "10000원";

	}else if(a >= 13 && a<=18) {

//		System.out.println("20000원");

		b = "20000원";

	}else if(a >= 19 && a<=64) {

//		System.out.println("30000원");

		b = "30000원";

	}else {

//		System.out.println("무료");

		b = "무료";

	}

	System.out.println("당신의 놀이동산 요금은 " + b + " 입니다.");

	

}

}
