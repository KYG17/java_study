	package com.gn.homework;

		import java.util.Scanner;

		public class Homework04 {



			public static void main(String[] args) { 

				Scanner sc = new Scanner(System.in);

				System.out.print("문자를 입력하세요:" );

				String word = sc.next();

				
		        char test = word.charAt(0) ;

		        int unicode = test;

		        System.out.println(word+ "의 유니코드:" + unicode);
		
		

	}

}
