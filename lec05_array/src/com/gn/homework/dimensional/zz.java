package com.gn.homework.dimensional;

public class zz {
	public static void main(String[] args) {
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

}
