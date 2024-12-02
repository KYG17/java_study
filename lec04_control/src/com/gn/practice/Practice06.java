package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
		int c = 0;
		for(int a = 1 ;  ; a++) {
			c = c + a;
			System.out.println(c);
			
			
			if(c > 100) {
				System.out.println("초과된 값 : " + c);
				break;
			}
			}
		
		
	}

}
