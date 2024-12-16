package com.gn.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		다음 조건에 따라 문자열을 분석하고 처리하는 프로그램을 구성하세요.
//		사용자로부터 세 개의 문자열을 입력 받습니다.
		System.out.print("문자열 (1) : ");
		String a = sc.nextLine();
		System.out.print("문자열 (2) : ");
		String b = sc.nextLine();
		System.out.print("문자열 (3) : ");
		String c = sc.nextLine();
//		세개의 문자열의 길이를 비교하여 가장 긴 문자열을 2번 연결한 다음 출력하세요.
		String longstr = a;
		if(b.length() > longstr.length()) {
			longstr = b;
		if(c.length() > longstr.length()) {
			longstr = c;
		}
		String test = longstr;
		test = test.concat(longstr);
		System.out.println(test);
		}	
//		만일, 가장 길이가 문자열과 길이가 동일한 문자열이 있다면 사전순으로 더 뒤에 있는 문자열을 2번 출력하세요.
		//compareTo()?
		
	
		
		

	}		
		
	}

