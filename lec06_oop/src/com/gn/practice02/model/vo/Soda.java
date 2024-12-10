package com.gn.practice02.model.vo;

public class Soda {
	public void sayHi() {
		System.out.println("환영합니다");
	}
	public int getBalance() {
		return 500;
	}
	
	public String[] sodaList() {
		return new String[] {"콜라","사이다"};
	}
	
	public Soda selectedSoda() {
		return new Soda();
	}
	
	public void method4 (int a, int b) {
		System.out.println(a+b);
		
	}


}
