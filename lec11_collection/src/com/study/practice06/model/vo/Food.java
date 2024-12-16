package com.study.practice06.model.vo;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	
	public Food() {};
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int hashCode() {
		return Objects.hash(name,price);
	}
	
	public boolean equals(Object obj) {
		boolean result = true;
		if(obj instanceof Food) {
			Food f = (Food) obj;
			if(f.name.equals(this.name) && f.price == this.price) {
				return result;
			}
		}
		return result;
	}
	
	public String toString() {
		return name+price;
//		return "5만원 치킨 취소 : " + name + price ;
		
		//왜 public String toString에 "5만원 치킨취소를 넣으면 각각에 출력?
		
	}

}
