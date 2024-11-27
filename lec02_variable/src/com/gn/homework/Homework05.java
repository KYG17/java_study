package com.gn.homework;
import java.util.Scanner;
public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: " );
		int a = sc.nextInt();
		System.out.print("영어: " );
		int b = sc.nextInt();
		System.out.print("수학: " );
		int c = sc.nextInt();
		System.out.println("총점: " + (a+b+c) );
		System.out.println("평균: " + (a+b+c) / 3);
		

	}

}
