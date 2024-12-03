package com.gn.practice;

import java.util.Scanner;

//import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("길동이 : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("길동이 : ");
		int a = sc.nextInt();
		
		
		int[] scores = {54,23};
		int[] scores1 = new int[scores.length+1];
		for(int i = 0 ; i < scores.length ; i++) {
			scores1[i] = scores[i];
		}
		scores1 [2] = 81;
		for(int num1 : scores) {
			System.out.print(num1+" ");
		}
		System.out.println();
		
		for(int num2 : scores1) {
			System.out.print(num2+" ");
		}
		
		
		
		

	}

}
