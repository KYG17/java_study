package com.gn.practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = 0;
		for(int a = 2 ; a <= 9 ; a++) {
			if(test == 45) {
				break;
			}
			System.out.println("==="+a+" 단 ===");
			for(int b = 1 ; b<=9 ; b++ ) {
				test = a  * b;
				
				System.out.println(a +"*" + b + "=" + test );
			}
			
		}
		

	}

}
