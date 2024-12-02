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
		
		//7. 배열의 출력
		// (1) 인덱스를 이용한 출력
		System.out.println(age1[1]);
		
		// (2) 반복문을 이용한 출력
		String[] fruits = {"딸기", "체리", "포도"};
		for(int i = 0 ; i < fruits.length ; i++) {
			System.out.println(fruits[i]);
		}
		// 8. toCharArray
		String text = "Hello World";
		char[] charArr = text.toCharArray();
		for(int i = 0 ; i < charArr.length ; i++) {
			System.out.println(charArr[i]);
		}
		
		
		// vs charAt(i)
		text = "안녕하세요.";
		for(int i = 0 ; i < text.length() ;i++) {
			System.out.println(text.charAt(i));
		}
		
		//9. for each문
		int[] numbers = {1,2,3,4,5};
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		for(int num:numbers) {
			System.out.println(num);
		}
		
		//10. 배열의 활용(1) - 총합과 평균
		int[] sus = {83, 90, 100, 100, 50};
		int sum = 0 ;
		for(int su : sus) {
			sum = sum + su;
		}
		System.out.println(sum);
		System.out.println((double)sum/5);
		
		//11. 배열의 활용(2) = 최대값과 최소값
		int[] arr = {8,9,10,4,10};
		//최대값
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		//최소값
		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		// 12. 배열의 활용(3) : 오름차순, 내림차순
		
		int[] data = {8,4,1,3};
		// 인덱스 기준으로 : 0 번과 1번 비교 -> 4, 8, 1, 3
		// 인덱스 기준으로 : 0 번과 2번 비교 -> 1, 8, 4, 3
		// 0번과 3번 비교 -> 1,8,4,3
		// 1번과 2번 비교 -> 1,4,8,3
		// 1번과 3번 비교 -> 1,3,8,4
		// 2번과 3번 비교 -> 1,3,4,8
		
		//0 -> 1,2,3
		//1 -> 2,3
		//2 -> 3
		for(int i = 0; i < data.length ; i++) {
			for(int j = i+1 ; j < data.length ; j++) {
				//System.out.println(i+" : " + j);
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		for( int d : data) {
			System.out.print(d+", ");
		}
		// 1,3,4,8
		// 0번이랑 1번을 비교 : 3,1,4,8
		// 0번이랑 2번을 비교 : 4,1,3,8
		// 0번이랑 3번을 비교 : 8,1,3,4
		// 1번이랑 2번을 비교 : 8,3,1,4
		// 1번이랑 3번을 비교 : 8,4,1,3
		// 2번이랑 3번을 비교 : 8,4,3,1
		
			}
		

	}
	
	
	
	


