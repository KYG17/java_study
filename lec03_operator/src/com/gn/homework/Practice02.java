package com.gn.homework;



import java.util.Scanner;



public class Practice02 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== 일기예보 ===");

		System.out.print("월 : ");

		int month = sc.nextInt();

		System.out.print("기온 : ");

		int temp = sc.nextInt();

		if(month == 2 || month == 12 || month ==1) {

			if(temp <= -15) {

				System.out.print("한파 경보");

			}else if(temp <= -12) {

				System.out.print("한파 주의보");

			}

		}

		else if(month == 6 || month == 7 || month ==8 ) {

			if(temp>=35) {

				System.out.print("여름폭염 경보");

			}else if(temp>=33) {

				System.out.print("폭염 주의보");

			}

		}

		else {

			System.out.println("해당 계절이 없음");

		}

		

		



	}



}