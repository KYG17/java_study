package com.study.practice04;

import java.util.ArrayList;
import java.util.List;



public class Run {
	public static void main(String[] args) {
		List<Product> a = new ArrayList<Product>();
		System.out.println("===for each로 조회===");
		a.add(new Product("사과" , 1000));
		a.add(new Product("바나나" , 2000));
		a.add(new Product("딸기" , 3000));
		
		for(Product n : a) {
			System.out.println(n);
		}
		
		System.out.println("===기본 for문으로 조회===");
		a.remove(1);
		
		a.set(0, new Product("오렌지" , 1500));
		for(int i = 0 ; i < a.size() ; i++) {
			System.out.println(i + ":" + a.get(i));
		}
		
		
	}

}
