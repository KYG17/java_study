package com.gn.practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
//		int a = 1;
//		while(a <=5) {
//			System.out.println("반복 횟수 : " + a);
//			a++;
//		}
//		System.out.println("반복 종료!");
		
		
		int i = 1;
		while(true) {
			System.out.println("반복 횟수 :"+i);
			i++;
			if(i>5) {
				break;
			}
		}
		
		System.out.println("반복 종료!");
		
		

	}

}
