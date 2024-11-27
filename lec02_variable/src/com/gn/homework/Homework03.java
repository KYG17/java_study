package com.gn.homework;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String word = sc.nextLine();
		System.out.print("첫번째 문자 :" );
		char first = word.charAt(0);
		System.out.println(first);
		System.out.print("두번째 문자 :" );
		char second = word.charAt(1);
		System.out.println(second);
		System.out.print("세번째 문자 :" );
		char third = word.charAt(2);
		System.out.println(third);
		
		
		
		
		
//		String word = "Hello";
//		char first =word.charAt(0);
//		System.out.println(first);
		

	}

}
