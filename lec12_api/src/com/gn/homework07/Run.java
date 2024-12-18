package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		1~100사이의 숫자 중에서 랜덤값을 추출하여 변수에 담으세요.
//		사용자로부터 숫자를 입력 받습니다. 
//		그다음 사용자가 랜덤값을 맞추는 데까지 몇번이 걸렸는지 출력하세요.
//		2) 출력 예시
//		1~100 사이의 임의의 난수를 맞춰보세요.
//		숫자를 입력하세요: 20
//		UP !
//		숫자를 입력하세요: 80
//		DOWN !
//		숫자를 입력하세요: 64
//		UP !
//		숫자를 입력하세요: 71
//		UP !
//		숫자를 입력하세요: 77
//		정답입니다 !!
//		5회만에 맞추셨습니다.
		
		Scanner sc = new Scanner(System.in);
		int b = 0;
		while(true) {
		System.out.print("1~100 사이의 임의 난수를 맞춰보세요 : ");
		int a = sc.nextInt();
		int rnd = (int)(Math.random()*100-1+1)+1;
		if(a < rnd) {
			System.out.println("UP!");
			b++;
		}else if (a > rnd){
			System.out.println("DOWN!");
			b++;
		}else {
			System.out.println("정답입니다");
			System.out.println(b + "회 만에 맞추셨습니다");
			break;
		}
		}
		
		
		
	}

}
