package com.gn.Practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
	Practice x = new Practice();
	
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 숫자 : ");
	int a = sc.nextInt();
	System.out.print("두번째 숫자 : ");
	int b = sc.nextInt();
	System.out.println("합: " + x.add(a, b) );
	System.out.println("곱: " + x.multiple(a, b) );
//	System.out.println("나누기: " + x.divide(a, b));
	
	
	try {
	 System.out.println("나누기: " + x.divide(a, b));
	}catch(ArithmeticException e){
		System.out.println("나누기 중 부적절한 연산이 발생했습니다");
	}finally {
		System.out.println("마지막까지 잘 도착했어요!!");
	}
	
	
	
	
	
	
	

	
	
	}
}
