package com.study.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.study.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓",15000));
		storage1.add(new Equipment("배트",6000));
		storage1.add(new Equipment("축구공",3000));
		
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트",6000));
		storage2.add(new Equipment("야구공",5000));
		storage2.add(new Equipment("글로브",9000));
		
//		System.out.println("***합집합***");
		Set<Equipment> add = new HashSet<Equipment>(storage1);
		add.addAll(storage2);
		Iterator<Equipment> iterator = add.iterator();
		System.out.println("***합집합***");
		while(iterator.hasNext()) {
			Equipment add1 = iterator.next();
			System.out.println("-" + add1);
		}
		
		
//		System.out.println("***교집합***");
		Set<Equipment> b = new HashSet<Equipment>(storage1);
		b.retainAll(storage2);
		System.out.println("***교집합***");
		Iterator<Equipment> iterator1 = b.iterator();
		while(iterator1.hasNext()) {
			Equipment b1 = iterator1.next();
			System.out.println("-" +b1);
		}
		
		
//		System.out.println("***차집합***");
		Set<Equipment> c = new HashSet<Equipment>(storage1);
		c.removeAll(storage2);
		System.out.println("***차집합***");
		Iterator<Equipment> iterator2 = c.iterator();
		while(iterator2.hasNext()) {
			Equipment c1 = iterator2.next();
			System.out.println("-" +c1);
		}
		
	
		
		
		
		
//		Iterator<String> iterator = add.iterator();
		
//		Iterator<String> iterator = fruits.iterator();
//		while(iterator.hasNext()) { //안에 뭐가 있으면요
//			String fruit = iterator.next(); //꺼내요
//			System.out.print(fruit);
//			iterator.remove();
//			if(fruits.size() != 0) {
//				System.out.println(", ");
		
	}

}
