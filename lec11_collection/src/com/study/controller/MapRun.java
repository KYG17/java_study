package com.study.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		//1. HashMap 생성
		Map<String, Object> flower = new HashMap<String,Object>(); //Object안에는 어떤 것을 넣어도 상관없음
		flower.put("name", "샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
		//2.중복된 key사용
		flower.put("price" , 50000); // "price",40000을 덮어버림
		System.out.println(flower);
		
		//4.HashMap 요소조회 (1)
		flower.get("name");
		String f_name =(String) (flower.get("name")); //다운케스팅!
		System.out.println(f_name);
		
		System.out.println(flower.get("lang")); // 아님 바로 출력
		
//		//6.HashMap 요소조회 (2)
//		//(1) HashMap 요소들의 key값으로 Set 만들기
//		Set<String> keySet = flower.keySet();
//		//(2) Iterator 만들기
//		Iterator<String> itKey = keySet.iterator();
//		//(3) 손을 집어넣는다 -> hasNext()
//		while(itKey.hasNext()) {
//			//(4) 확인한다 -> next();
//			String key =itKey.next();
//			System.out.println(key);
//			Object value = flower.get(key);
//			System.out.println(key + ":" + value);
//		}
//		
//		//(1) HashMap 요소들의 key+value 값으로 entrySet 만들기
//		Set<Entry<String,Object>> entrySet = flower.entrySet();	
//		//(2) Iterator 만들기
//		Iterator<Entry<String,Object>> itEntry = entrySet.iterator();
//		//(3) hasNext()
//		while(itEntry.hasNext()) {
//			//(4) next()
//			Entry<String,Object> entry = itEntry.next();
//			String key = entry.getKey();
//			Object value = entry.getValue();
//			System.out.println(key + "=" + value);
//		}
//		
		
		
		
		
		//3. HashMap<key,객체> 요소추가
		Map<String,Snack> snackMap = new HashMap<String,Snack>();
		snackMap.put("다이제", new Snack("초코맛",1700));
		snackMap.put("새우깡", new Snack("매운맛",900));
		snackMap.put("포테이토칩", new Snack("양파맛",500) );
		//key(다이제,새우깡,포테이토칩) = to String 문
		System.out.println(snackMap);
		
		//5. HashMap<key,객체> 요소조회(1)
		Snack s1 = snackMap.get("다이제"); // ->s1에 다이제 정보가 들어감
		System.out.println(s1);
		s1.setFlavor("기본맛");
		//Snack s1 = new Snack("초코맛",1700)
		System.out.println(snackMap); //맛이 기본맛으로 변경됨
		
		//포테이토칩 양파맛 -> 소금 맛
		
		
		//7. HashMap<객체> 요소 조회(2)
		//(1) keySet()
		Set<String> keySet = snackMap.keySet(); 
		Iterator<String> itkey = keySet.iterator();
		while(itkey.hasNext()) {
			String key = itkey.next();
			Snack value = snackMap.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("=======");
		//(2) entrySet()
		Set<Entry<String,Snack>> entrySet = snackMap.entrySet();
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("===요소삭제====");
		//8.HashMap 요소삭제
		System.out.println(flower.size() + " : " + flower);
//		flower.remove("price");
//		System.out.println(flower.size() + ":" + flower);
//		flower.clear();
//		System.out.println(flower.size() + " : " + flower);
//		
		//9.HashMap 요소 검색
		if(flower.containsKey("price")) {
			System.out.println("o");
		}else {
			System.out.println("x");
		}
		
		if(flower.containsValue(40000)) {
			System.out.println("싸다");
		}else {
			System.out.println("비싸다");
		}
		
		System.out.println(snackMap);
		//10.HashMap<객체> 요소 검색
		if(snackMap.containsValue(new Snack("매운맛",900))) {
			System.out.println("다 내꺼");
		}
		
		//11.LinkedHashMap
		System.out.println("===LinkedHashMap====");
//		Map<String, Object> flower2 = new LinkedHashMap<String,Object>();
//		Map<String, Object> flower2 = new HashMap<String,Object>();
//		flower2.put("price", 20000);
//		flower2.put("lang", "고백");
//		flower2.put("name","튤립");
//		System.out.println(flower2);
		
		System.out.println("===TreeMap====");
		Map<String, Object> flower2 = new TreeMap<String,Object>();
		flower2.put("price", 20000);
		flower2.put("lang", "고백");
		flower2.put("name","튤립");
		System.out.println(flower2);
		
		
}

}
