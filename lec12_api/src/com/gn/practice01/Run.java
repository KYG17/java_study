package com.gn.practice01;

public class Run {
//	크기가 1,000,000인 정수 배열을 생성하세요.
//	그 다음 랜덤값(1~100사이)으로 해당 배열을 초기화하세요.
//	System.arraycopy()를 사용하여 이 배열의 절반을 새로운 배열로 복사하세요.
//	복사된 배열의 값을 출력예시와 같은 모양으로 출력하세요.
//	System.curentTimeMillis()를 사용하여 기능 구현에 소요되는 시간을 측정하여 출력하세요.
	public static void main(String[] args) {
	long before = System.currentTimeMillis();
	
	int [] src = new int[1000000];
	for(int i = 0 ; i < src.length ; i++) {
		src[i] =(int)(Math.random()*100) + 1; // 곱하기 범주만큼 더하기 시작점   
	}
	
	int[] dst = new int [src.length / 2];
	System.arraycopy(src, 0, dst, 0, dst.length);
	
	
	
	
	
	long after = System.currentTimeMillis();
	
	}
	
	
	 
	
	
		
	

			
		
		
		

		
		
	}


