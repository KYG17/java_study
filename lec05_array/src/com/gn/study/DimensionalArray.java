package com.gn.study;

public class DimensionalArray {

	public static void main(String[] args) {
		int score1 = 85;
		int score2 = 90;
		int score3 = 78;
		int score4 = 92;
		int score5 = 88;
		
		int[] scores = {85,90,78,92,88};
		
		//1. 배열의 선언
		//선언, 생성, 초기화
		int[] intArr;
		String[] strArr; 
		
		//2. 배열의 생성
		int[] nums; // 선언
		nums = new int[4]; //생성
		
		int[] heights = new int[10]; //생성
		
		//3. 배열의 길이(인덱스)
		System.out.println(heights.length);
		
		//4. 배열의 초기화(default)
		System.out.println(heights[2]);
		
		//5. 배열의 초기화(값 변경)
		// (1) 인덱스 활용
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;
		
		
		// (2) for문 : 규칙이 있는 경우
		int[] age2 = new int[3];
		for(int i = 0 ; i < age2.length ; i++) {
			age2[i] = i+10;
			
		}
		
		// (3) 선언과 동시에 초기화
		// 선언 -> 생성 -> 초기화
		int[] age3 = new int[] {1,2,3,4};
		int[] age4 = {5,6,7};
		
		// 아래 방법 불가능!!!
//		int[] element;
//		element = {9,10,11};
		
		//6. 배열의 저장과정
		// (1) 선언 : Stack에 and라는 이름의 저장공간 마련
		int[] and; 
		// (2) 생성 : Heap에 기차가 생김, Stack에 기차의 주소값 저장
		and = new int[4];
		// (3) 초기화 : Heap의 값 변경
		and[0] = 90;
		
		
		
		

	}

}
