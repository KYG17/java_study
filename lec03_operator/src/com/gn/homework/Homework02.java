package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int a = sc.nextInt();
		if ( a == 0) {
			System.out.print("x");
		}
		else if ( a % 2 == 0) {
			System.out.println("구슬의 개수는 짝수입니다");
		}else {
			System.out.println("구슬의 개수는 홀수입니다");
		}
		
		
		
		

	}

}
