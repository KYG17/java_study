package com.gn.study.model.vo;

public abstract class Animal { //클래스도 abstract로 -> 추상 클래스
	public abstract void sound(); //추상 메소드
	
	public void breath() {
		System.out.println("동물은 숨을 쉽니다");
	}

}
