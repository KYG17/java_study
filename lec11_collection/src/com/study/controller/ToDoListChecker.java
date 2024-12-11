package com.study.controller;

import java.util.ArrayList;
import java.util.List;

public class ToDoListChecker {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//1.리스타가 비어있는지 확인
		if(list.isEmpty()) { //비어있습니까?!
			System.out.println("할 일이 아직 없습니다"); // true의 값
		}
		
		//2. 할 일 추가
		list.add("운동하기");
		list.add("책을 읽자");
		
		
		//3. 특정 항목 확인
		if(list.contains("코딩 공부하기")) { //리스트 안에 코딩 공부하기 항목이 있니?
			System.out.println("O");
		}else {
			System.out.println("X");
			list.add("코딩공부하기");
		}
		System.out.println(list);   //운동하기, 책을 읽자, 코딩 공부하기
		
		System.out.println(list.indexOf("코딩공부하기")); // index 2번
		
		if(list.indexOf("영화보기") == -1) { //영화보기가 없으면 list에 영화보기를 add 해줘!
//			System.out.println("없습니다");
			list.add("영화보기");
		}
		System.out.println(list);
		
		
		
	}

}
