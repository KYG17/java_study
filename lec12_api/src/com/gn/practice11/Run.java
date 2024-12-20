package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {



		
//		오늘 날짜 : OOOO년 OO월 OO일
		LocalDate a = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String result = a.format(dtf);
		System.out.println("오늘 날짜 : " + result);
		
//		영화 개봉까지 남은 날 : OO일
		LocalDate startA = LocalDate.now();
		LocalDate endA = LocalDate.of(2024, 12, 25);
//		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd일");
		long abBetween = ChronoUnit.DAYS.between(startA, endA);
//		String result1 = abBetween.format(dtf1);
		System.out.println("영화 개봉까지 남은 날 : " + abBetween + "일");
		
//		개봉일 : 2024년 12월 25일
		LocalDate b = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String result2 = b.format(dtf2);
		System.out.println("개봉일 : " + result2);
		
//		영화 개봉일의 요일 : 수요일
		int x = endA.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : " + getKoreanDayOfWeek(x));
		
		
	}
	public static String getKoreanDayOfWeek(int day) {
		// LocalDate의 getDayOfWeek().getValue() 활용
		// 요일의 정보를 숫자 형태로 전달 받아서 문자열 형태의 요일 정보 리턴
		String str = "";
		switch(day) {
			case 1 : str ="월"; break;
			case 2 : str ="화"; break;
			case 3 : str ="수"; break;
			case 4 : str ="목"; break;
		}
//		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("E요일");
//		String result3 = d.format(dtf3);
		
		return str;
		
	
		
		
  

}

}