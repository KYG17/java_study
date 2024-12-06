package com.gn.study.constructor.model.vo;

public class Cake {
	//변수 기본값
	public String flavor;  //public String flavor = "choco" ->명시적 초기화
	
	
	//명시적 초기화
	public static int price = 27000;
	
	
	
	
	//초기화 블록
	{flavor="딸기";}
	static {price = 32000;}
	
	
	//생성자를 이용한 초기화
	public Cake() {
		this.flavor = "녹차";
//		this.price = 40000;
	}

}
