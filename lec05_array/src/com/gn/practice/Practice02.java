package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
//		1) 문제
//	아래 값을 활용해서 정수 배열을 구성하세요.
//	( -62, 107, -12, 89, -35 )
//	for each문을 사용하여 각 숫자를 확인하세요.
//	50을 넘는 숫자가 있다면 해당 숫자를 출력해주세요.
//	2) 출력 예시
//	107
//	89
		
		int[] numbers = {-62,107,-12,89,-35};
		for(int num:numbers) {
			if(num > 50)
			System.out.println(num);
		}
		

		
		

	}

}
