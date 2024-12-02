package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조명의 밝기를 입력하세요 (0~3):" );
		int a = sc.nextInt();
		String br;
		System.out.print("현재 조명의 밝기:" );
		switch(a) {
		case 0:
			br = "조명을 끕니다.";
			break;
		case 1: 
			br = "어두운 조명입니다";
			break;
		case 2:
			br = "밝은 조명입니다";
			break;
		case 3:
			br = "매우 밝은 조명입니다";
		default:
			br = "올바른 입력이 아닙니다";
			break;
		}
		System.out.print(br);
		
		
		
		

	}
	
}
