package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[] data = {152, 180, 165, 158, 171};
		for(int i = 0 ; i < data.length-1 ; i++ ) {
			for(int j = i+1 ; j < data.length ; j ++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			
		}
		for(int i = 0 ; i <data.length; i++) {
			System.out.println(data[i]);
		}
	}
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		int b = sc.nextInt();
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		int c = sc.nextInt();
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		int d = sc.nextInt();
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		int e = sc.nextInt();
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		int f = sc.nextInt();
		
		
		
	}	
}
		
	


