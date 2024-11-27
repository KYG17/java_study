package com.gn.homework;
import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) :"  );
		double a = sc.nextDouble();
		System.out.print("키(m) :" );
		double b = sc.nextDouble();
		System.out.print("BMI 지수 : ");
		System.out.printf("%.1f", a / (b * b));
		
		

	}

}
