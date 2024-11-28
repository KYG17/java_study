package com.gn.homework;

import java.util.Scanner;

public class Homework05 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어: " );

		double a = sc.nextDouble();

		System.out.print("영어: " );

		double b = sc.nextDouble();

		System.out.print("수학: " );

		double c = sc.nextDouble();

		System.out.println("총점: " + (int)(a+b+c) );

		System.out.println("평균: " + (int)((a+b+c) / 3));

	}

}
