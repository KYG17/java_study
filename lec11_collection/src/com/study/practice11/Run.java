package com.study.practice11;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		
		Map<Integer,Fruit> fr = new TreeMap<Integer,Fruit>();
		fr.put(2 , new Fruit("사과","영주",5,20000));
		fr.put(3 , new Fruit("포도","제주",10,35000));
		fr.put(1 , new Fruit("귤","제주",10,15000));
		fr.put(4 , new Fruit("배","나주",7,50000));
		
		
		System.out.println("===전체 데이터 조회===");
		Set<Integer>keySet = fr.keySet();
		Iterator<Integer> itkey = keySet.iterator();
		while(itkey.hasNext()) {
			Integer key = itkey.next();
			Fruit value = fr.get(key);
			System.out.println(key + " : " + value);	
		}
		
		
		System.out.println("===20000만원 이상 ===");
		
		
	Set<Entry<Integer, Fruit>> entrySet = fr.entrySet();
		Iterator<Entry<Integer, Fruit>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<Integer, Fruit> entry = itEntry.next();
			Integer key = entry.getKey();
			Fruit value = entry.getValue();
			
			if(value.getPrice() >= 20000) {
				System.out.println(key + ":" + value);
			}
	
		}
		 System.out.println("===이름이 한 글자인 과일 ===");
		 
		 
		 
		Set<Integer> keyset = fr.keySet();
		Iterator<Integer> ikey = keyset.iterator();
		while(ikey.hasNext()) {
			Integer key = ikey.next();
			Fruit value = fr.get(key);
			
			if(value.getName().length() < 2 ) {
				System.out.println(key + ":" + value);				
			}
		}
		
	
		System.out.println("===포도 가격 인상===");
		
		Set<Entry<Integer,Fruit>> entrySet1 = fr.entrySet();
		Iterator<Entry<Integer,Fruit>> itet = entrySet.iterator();
		while(itet.hasNext()) {
			Entry<Integer,Fruit> entry = itet.next();
			Integer key = entry.getKey();
			Fruit value = entry.getValue();
			if(value.getName() == "포도") {
				fr.get(3).setPrice(28000);
				System.out.println(key +":" + value);
				
				
			}
			
	
			
			
			
		 }
		
		
		
		
	}		
		
		
}	
	


