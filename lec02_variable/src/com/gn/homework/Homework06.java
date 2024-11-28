package com.gn.homework;

import java.util.Scanner;



public class Homework06 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("한 자리 숫자를 입력하세요: ");

		String word = sc.nextLine();

	    char test = word.charAt(0);

	  

	    System.out.print(("입력한 숫자의 제곱은 ") +((test-'0')*(test-'0'))+ ("입니다") );

	    
		
		
		
		
		

	}

}
