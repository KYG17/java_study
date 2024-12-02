package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {
		int[] ages = {20, 18, 22, 19, 21};
		int max = ages[0];
		for(int i = 0 ; i < ages.length ; i++) {
			if(ages[i] > max) {
				max = ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이: " + max);
		int min = ages[0];
		for(int a = 0 ; a < ages.length ; a++) {
			if(ages[a] < min) {
				min = ages[a];
			}
		}
		System.out.println("가장 나이가 적은 학생의 나이: " + min);
	}
	
	
	
		

}
