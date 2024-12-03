package com.gn.homework.dimensional;

import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		System.out.println("1. 키순서대로 앉으세요.");
		System.out.println("2. 값 입력 받아 배열 만들기");
		System.out.println("3. 올라갔다 내려갔다");
		System.out.println("5. 컴퓨터와 가위바위보");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc. nextInt();
		
		switch(menu) {
		case 1 : practice.practice01();
			break;
		}
		sc.close();
	}
	

}
