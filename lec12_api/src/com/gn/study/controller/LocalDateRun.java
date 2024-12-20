package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateRun {
	public static void main(String[] args) {
		//1. LocalDate
		// (1) 현재 날짜 구하기
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		// (2) 특정 날짜 선언
		LocalDate date2 = LocalDate.of(2024, 12, 25);
		System.out.println(date2);
		
		// (3) 필드 조회
		System.out.println(date1.getYear()); // -> 년도 정보 반환
		System.out.println(date1.getMonthValue() ); // -> 월(Month) 정보 반환
		System.out.println(date1.getDayOfMonth()); // -> 일(day) 정보 반환
		System.out.println(date1.getDayOfWeek().getValue()); // -> 요일 반환 ,,but getValue() 사용하면 숫자 형태로 반환
		// = > 1 : 월요일 ~ 7 : 일요일
		
		// (4) 필드 증가
		LocalDate date3 = date1.plusWeeks(1); //1주뒤는 언제에요?
		System.out.println(date3);
		
		// (5) 필드 감소
		LocalDate date4 = date1.minusDays(3); // 3일 전 찾기
		System.out.println(date4);
		
		//2. LocalTime
		// (1) 현재 시간
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		// (2) 특정 시간 지정
		LocalTime time2 = LocalTime.of(12, 50, 5);
		System.out.println(time2);
		
		// (3) 특정 필드 조회
		System.out.println(time1.getMinute());
		System.out.println(time1.getHour()); 
		System.out.println(time1.getSecond());
		
		// (4) 필드 증가
		LocalTime time3 = time1.plusHours(7); // Hour 단위로만 올라감
		System.out.println(time3);
		
		// (5) 필드 감소
		LocalTime time4 =time1.minusMinutes(20);
		System.out.println(time4); // Minutes 단위만 과거로감
		
		//3. LocalDateTime
		// (1) 현재 날짜와 시간
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
		// (2) 특정 날짜와 시간
		LocalDateTime dateTime2 = LocalDateTime.of(2025,1,1,6,30,45);
		System.out.println(dateTime2);
		
		//4. DateTimeFormatter
		// (1) 날짜와 시간 -> 문자열
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String result1 = now1.format(dtf1); //현재 날짜와 시간 now1 와 연결
		System.out.println(result1);
		// => 2024년 12월 18일 10시 29분 58초
		
		// (2) 문자열 -> 날짜와 시간
		String str2 = "2024-12-24 13:50:26";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //문자열을 보고 설명
		LocalDateTime dateTime3 = LocalDateTime.parse(str2,dtf2);
		System.out.println(dateTime3);
		// => 2024-12-24T13:50:26
		
		
		//5. ChronoUnit
		LocalDate starDate = LocalDate.of(2024, 1,1);
		LocalDate endDate = LocalDate.of(2024, 12,31);
		long daysBetween = ChronoUnit.DAYS.between(starDate,endDate);
		System.out.println(daysBetween); // 두 날의 일수 차이를 계산해줌
		
		
		
		
	}

}
