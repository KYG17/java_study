package com.gn.homework;

import java.util.Scanner;

public class Homework04{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("수학 : ");
		int b = sc.nextInt();
		System.out.print("영어 : ");
		int c = sc.nextInt();
		int d = a + b + c;
		int e = (a + b + c) / 3 ;
		System.out.print("합계 :  ");
		System.out.println(d + "점");
		System.out.print("평균 : ");
		System.out.println( e + "점");
		
		if(e>=90) {
			System.out.println("휴대폰을 바꿀 수 있습니다");
		}else {
			System.out.println("휴대폰을 바꿀 수 없습니다");
		}
		
		
		

	}

}