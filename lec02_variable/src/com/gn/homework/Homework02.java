package com.gn.homework;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 :" );
		double a = sc.nextDouble();
		System.out.print("세로: " );
		double b = sc.nextDouble();
		System.out.print("면적:" );
		System.out.printf("%.2f\n", a * b);
		System.out.print("둘레:" );
		System.out.printf("%.1f", (a + b) * 2);
		

	}

}
