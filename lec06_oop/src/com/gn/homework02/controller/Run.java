package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		
	Person a = new Person();
	
	a.num = "01012345678";
	a.height = 175.4;
	a.kg = 65.6;
	
	System.out.println("전화번호: " + a.num);
	System.out.println("키: " + a.num);
	System.out.println("몸무게: " + a.kg);
	
	Person b = new Person();
	
	b.num = "01056434563";
	b.height = 190.5;
	b.kg = 100.2;
	
	System.out.println("전화번호: " + b.num);
	System.out.println("키: " + b.height);
	System.out.println("몸무게: " + b.kg);
	}
}
