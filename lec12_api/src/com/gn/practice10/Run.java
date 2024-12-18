package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		//오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		//00월 00일 00요일
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 7);
		
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.MONTH, 1);
		Date date1 = cal1.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf1.format(date1));
		
	}

}
