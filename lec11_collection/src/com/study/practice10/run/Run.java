package com.study.practice10.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.study.practice10.model.vo.Planet;

public class Run {
	public static void main(String[] args) {
	Map<String,Planet> pr = new HashMap<String,Planet>();
	pr.put("Earth", new Planet("(지구)", 12742 , 1.0));
	pr.put("Mars", new Planet("(화성)", 6779, 1.88));
	pr.put("Venus", new Planet("(금성)", 12104, 0.62));
	pr.put("Mercury", new Planet("(수성)", 4879,0.24));
	
	System.out.println("***keySet() 사용***");
	
	

	
	Set<String> keySet = pr.keySet();
	Iterator<String> itpr = keySet.iterator();
	while(itpr.hasNext()) { 
		
		String key = itpr.next();
		Planet value = pr.get(key);
		System.out.println("행성이름: " + key + value);		
	}
	
	
	System.out.println("***entrySet() 사용***");
	Set<Entry<String,Planet>> entrySet = pr.entrySet();
	Iterator<Entry<String,Planet>> etpr = entrySet.iterator();
	while(etpr.hasNext()) {
		Entry<String,Planet> entry = etpr.next();
		String key = entry.getKey();
		Planet value = entry.getValue();
		System.out.println("키 : " +key + value);
	} 
		
		
	}
	

	
	
	
	
	
	
	
	
	}


