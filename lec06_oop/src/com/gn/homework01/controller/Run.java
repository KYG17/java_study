package com.gn.homework01.controller;

import com.gn.homework01.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		
	
	
	Employee a = new Employee();
	a.name = "김철수";
	a.team = "경영지원팀";
	
	System.out.println(a.name);
	System.out.println(a.team);

	
	Employee b = new Employee();
	b.name = "이영희";
	b.team = "경영지원팀";
	
	System.out.println(b.name);
	System.out.println(b.team);
	}
}
