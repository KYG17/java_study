package com.gn.homework.test;
//기능 메소드
import java.util.Scanner;
public class Practice {
	// 1번 기능 : 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
	}
	// 2번 기능 : 두개의 숫자를 입력 받아서 합 출력
	public void practice02() {
		System.out.print("첫 번째 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		System.out.println(a += b);
		sc.close();
	}
}
	