package com.gn.practice03.model.vo;

public class Circle extends Point {
	private int radius;
	private static double PI = 3.14;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : %1f\n" + PI*radius*radius);
		System.out.println("둘레 : %1f\n" + PI+radius*2);
		
		
	}
	

}