package com.gn.homework03.controller;

import com.gn.homework03.model.vo.Yong;

public class Run {
	public static void main(String[] args) {
		Yong a = new Yong();
		
		a.name("안녕하세요", "반갑습니다");
		
		int num = a.multiple(6, 3); // 18
		System.out.println(num); // int
		 


		
		
		
	}

}
