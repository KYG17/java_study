package com.gn.homework;


import java.util.Scanner;



public class Homework01 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("말해보세요 : ");

		String a = sc.next();

		String b = "간다";

		String as ;

		//boolean test1 = a.equals(b);

		if(a.equals(b)) {

			as="온다";

		}

		else {

			as="간다";

		}

		System.out.print("앵무새 : "+as);







	}



}