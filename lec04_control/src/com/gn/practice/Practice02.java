package com.gn.practice;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력 :" );
		a=sc.nextInt();
		String b ;
		if(a > 90) {
			b = "A";
//				System.out.println("A");
		}else if(a <= 90 && a >80) {
			b = "B";
//				System.out.println("B");
		}else if(a <= 80 && a >70) {
			b = "C";
//				System.out.println("C");
		}else if(a <=70 && a >60) {
			b = "D";
//				System.out.println("D");
		}else{
			b = "F";
//			System.out.println("F");			
		}
		
		System.out.println("당신의 학점은 " + b + "입니다.");

	}

}
