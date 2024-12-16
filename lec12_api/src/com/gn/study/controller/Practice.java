package com.gn.study.controller;

public class Practice {
	public static void main(String[] args) {
//		String test = "우리는";
//		test = test +"할수있다";
//		System.out.println(test);
		
		String str = "봄-여름-가을-겨울";
		String[] seasons = str.split("-");
		for(String season : seasons) {
			String test = season;
			test += season;
			System.out.print(test);
		}
	}

}
