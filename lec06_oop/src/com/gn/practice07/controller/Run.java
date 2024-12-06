package com.gn.practice07.controller;

import com.gn.practice07.model.vo.Supplement;

public class Run {

	public static void main(String[] args) {
		
	Supplement[] s1 = new Supplement[4];
	Supplement a = new Supplement("이름: 유산균","복용량: 1알", "가격: 18000원" );
	s1[0] = a;
	Supplement b = new Supplement("이름: 비타민B" , "복용량: 1알", "가격: 15000원");
	s1[1] = b;

	}

}
