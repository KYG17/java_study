package com.gn.study.arr.controller;

import com.gn.study.arr.model.vo.AH;

public class Rrrun2 {

	public static void main(String[] args) {
		
		
		
		AH[] a = {
				new AH("다담","222"),
				new AH("용규","333")
		};
		
//		System.out.println(a[0].getName());
//		System.out.println(a[0].getPhone());
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("이름 : " + a[i].getName());
//			System.out.println("번호: " + a[i].getPhone());
		}
		

	}

}
