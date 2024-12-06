package com.gn.study.model.vo;

public class Child extends Parent {
	private int b;
	
	public Child () {  //기본생성자
		super(3); //부모의 기본생성자를 가지고 옴
		System.out.println("자식 기본 생성자 호출!!");
	}
	public Child(int a ,int b) { //매개변수 생성자
		super(a);
		this.b = b;
		System.out.println("자식 매개 변수 생성자 호출~~");
	}

}
