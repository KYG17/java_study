package com.gn.practice03.model.vo;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void sexY(int Y) {
		this.x=y;
	}
	
	public void draw() {
		System.out.println("(x,y): ("+x+","+y+")" );
	}

}
