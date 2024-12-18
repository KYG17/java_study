package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
//		- 철수는 새로운 카페를 준비중인 점주입니다.
//		- 가게 오픈까지 남은 준비 기간 동안의 일정을 관리해야합니다.
//		- 카페 오핀일은 2025년 1월 24일입니다.
//		- 오픈 준비를 위해 아래 일정을 확인해주세요.
//		    1. 오늘 날짜 기준으로 카페 오픈일까지 남은 날짜 수
//		    2. 카페 오픈일이 속한 달의 마지막 날
//		    3. 카페 오픈일의 요일
		
		
//		- 카페 오핀일은 2025년 1월 24일입니다.
		Calendar c1 = Calendar.getInstance();
		c1.set(2025, 1-1, 24);
		Date date = c1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일");
		System.out.println("오픈 날짜 : " + sdf.format(date));

		Calendar c2 = Calendar.getInstance();
		long differ = c1.getTimeInMillis() - c2.getTimeInMillis();
		differ = differ / 1000;
		differ = differ / (24*60*60);
		System.out.println("카페 오픈일 까지 남은 날 : " + differ +"일");
		
		
		int a = c1.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈 달의 마지막 달 : " + a);
		
		Calendar c3 = Calendar.getInstance();
		c3.set(2025, 1-1, 24);
		Date date1 = c3.getTime();
		sdf = new SimpleDateFormat("E요일");
//		SimpleDateFormat sdf1 = new SimpleDateFormat("E요일");
		System.out.println("카페 오픈 요일 : " +sdf.format(date1));
		
		
				
				
				
		
		
	}

}
