package com.gn.homework.test;

import java.util.Scanner;

// 메인 메소드 ->
public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 인사하기");
		System.out.println("2. 두 정수의 합 구하기");
		System.out.print("선택: ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : practice.practice01();
			break;
		case 2 : practice.practice02();
			break;
		}
		sc.close();
		
		
		// 1번 기능 호출
//		practice.practice01();
		// 2번 기능 호출
//		practice.practice02();
		
		
	}
}
