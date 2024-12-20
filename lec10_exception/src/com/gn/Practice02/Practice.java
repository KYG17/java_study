package com.gn.Practice02;

public class Practice {
//	Academy[] arr1;
	
	
	
	//메소드
	//메소드명 : printStrLength
	//매개변수 : 참조형 변수 ->String
	
	public void printStrLength(String str) {
		
		try {
			str.length();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생: " + e.getMessage());
		}
		
			
	}
	
		
		
	

}
