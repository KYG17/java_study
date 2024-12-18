package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice01 {
	public static void main(String[] args) {
		Calendar cal7 = Calendar.getInstance();
		cal7.add(Calendar.DATE, 1); //25년을 만들고 싶어요
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a KK:mm");
//		sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss");
		System.out.println(sdf2.format(date));

	

	}

}
