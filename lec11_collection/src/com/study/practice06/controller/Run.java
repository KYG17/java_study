package com.study.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.study.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
		Set<Food> chicken = new HashSet<Food>();
		chicken.add(new Food("샐러드", 14000));
		chicken.add(new Food("치킨", 23000));
		chicken.add(new Food("치킨", 50000));
		
		
		chicken.remove(new Food("치킨", 50000));
		System.out.println("5만원 치킨 취소 :" +chicken);
		
		chicken.clear();
		System.out.println("전체 주문 취소 : " +chicken);
	}

}
