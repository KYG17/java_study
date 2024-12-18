package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
//		1) 문제
//	연초(1월 1일)부터 오늘까지 며칠이 지났는지 계산하세요.
//	아래 힌트를 참고하여 문제를 해결하세요.
//	2) 힌트

//	오늘 날짜는 Calendar.getInstance()로 생성하세요.
//	두 날짜의 밀리초 차이를 계산하려면 getTimeInMillis() 메소드를 사용하세요.
//	일수로 변환하려면 아래 수식을 사용하세요.
//	diff = diff/1000;
//	long days = diff / (24 * 60 * 60 * 1000);
//	
		
//		연초 날짜는 Calendar 객체를 사용해 2024년 1월 1일로 설정하세요.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2024,1-1, 1);
		Calendar today =Calendar.getInstance();
		long diff = today.getTimeInMillis() - cal1.getTimeInMillis();
		diff = diff/1000;
		long days = diff / (24*60*60);
		System.out.println(days);
		
		
		
	}

}
