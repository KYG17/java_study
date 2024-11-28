package com.gn.practice;
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째: ");
		int a = sc.nextInt();
		System.out.print("두번째 : ");
		int b = sc.nextInt();
		System.out.print("세번째 : ");
		int c = sc.nextInt();
		int min = a < b ? a : b ;
		System.out.println("두 수 중에서 작은 수는? :" + min);
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.print("가장 큰 수? : " + max);
				
		
	

	}

}
