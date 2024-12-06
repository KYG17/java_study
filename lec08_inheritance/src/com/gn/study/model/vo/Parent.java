package com.gn.study.model.vo;

public class Parent {
	private int a; 
	
	public int getA() {
		return a;
	}
	
//	public Parent() {}; // 1. 기본 생성자 만들어주기
	
	public Parent(int a) { //매개변수 생성자
		this.a = a;
		System.out.println("부모 매개변수 생성자 지롱");
	}

}
