package com.gn.homework;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int a = sc.nextInt();
		if(a >= 40) {
			System.out.print("합격입니다"); 
		}else if(a == 40) {
			System.out.print("합격입니다");
		}else {
			System.out.print("소프트웨어설계 과목 과락으로 불합격입니다");
		}
		System.out.print("소프트웨어개발 점수: ");
		int b = sc.nextInt();
		if(b >= 40) {
			System.out.print("합격입니다");
		}else if(b == 40) {
			System.out.print("합격입니다");
		}else {
			System.out.print("소프트웨어개발 과목 과락으로 불합격입니다");
		}
//		System.out.print("데이터베이스구축 점수: ");
//		int c = sc.nextInt();
//		System.out.print("프로그래밍언어활용 점수: ");
//		int d = sc.nextInt();
//		System.out.print("정보시스템구축관리 점수: ");
//		int e = sc.nextInt();
//		int average = ((a+b+c+d+e)/5);
		int average = ((a+b)/2);
		
	
		
		
		
		
	
		

	}

}
