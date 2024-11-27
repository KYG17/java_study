package com.gn.practice;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		int result = 100;
		result += 3;
		System.out.println(result); //103
		result -= 10;
		System.out.println(result); //93
		result *= 2;
		System.out.println(result); //186
		result /= 3;
		System.out.println(result); //62
		result %= 3;
		System.out.println(result); //2
		
		// 홀수, 짝수
		// 1,3,5... -> 2로 나눴을 때 나머지 1
		// 2,4,6... -> 2로 나눴을 때 나머지 0
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int num = sc.nextInt();
		System.out.println(num +=3);
		System.out.println(num -=10);
		System.out.println(num *=2);
		System.out.println(num /=3);
		System.out.println(num %=30);
		
		
		
	
		
		
		
	
	}

}
