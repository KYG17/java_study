package com.study.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.study.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		
	
	Set<Person> c1 = new HashSet<Person>();
	
	c1.add(new Person("홍길동" , 20));
	c1.add(new Person("이순신" , 25));
	c1.add(new Person("유관순", 22));
	
	Set<Person> c2 = new HashSet<Person>();
	c2.add(new Person("유관순", 22));
	c2.add(new Person("강감찬", 27));
	c2.add(new Person("을지문덕",30));
	
	Set<Person> add = new HashSet<Person>(c1);
	Set<Person> union = new TreeSet<Person>(c1);
	union.addAll(c2);
	System.out.println("***합집합***");
	Iterator<Person> iterator = union.iterator();
	while(iterator.hasNext()) {
		Person add1 = iterator.next();
		System.out.println(add1);
	}
	
	Set<Person> diff = new HashSet<Person>(c1);
	diff.retainAll(c2);
	System.out.println("***교집합***");
	Iterator<Person> iterator1 = diff.iterator();
	while(iterator1.hasNext()) {
		Person a1 = iterator1.next();
		System.out.println(a1);
	}
	
	Set<Person> same = new HashSet<Person>(c1);
	same.removeAll(c2);
	System.out.println("***차집합***");
	Iterator<Person> iterator2 = same.iterator();
	while(iterator2.hasNext()) {
		Person a2 = iterator2.next();
		System.out.println(a2);
	}
	

	

	
	
	
	
	
	
	}
}
