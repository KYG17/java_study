package com.gn.practice;

public class Practice1111 {

	public static void main(String[] args) {
		int[] scores = { 54,23};
		int[] scores1 = new int[scores.length+1];
		for (int i = 0 ; i < scores.length ; i ++) {
			scores1[i] = scores[i];
		}
		scores1[2] = 81 ;
		for(int num1 : scores) {
			System.out.print(num1+" ");
		}
		System.out.println();
		
		for(int num2 : scores1) {
			System.out.print(num2+" ");
		}
	

	}

}
