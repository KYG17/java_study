package com.gn.homework;



import java.util.Scanner;



public class Homework05 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호(-) :");

		String a = sc.next();

		char seven = a.charAt(7);

		String b;

	

		if(seven == '1' || seven == '3') {

			b = "남성";

		}else if(seven == '2' || seven == '4') {

			b = "여성";

		}else {

			b="잘못된 값";

		

		}

		System.out.println("입력하신 주민번호는" + b + "입니다");



	}



}