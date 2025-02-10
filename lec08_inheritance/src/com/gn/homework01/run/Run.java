package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
	
	
	Student[] arr = new Student[3];
	arr[0] = new Student("김철수", 20 , 179.2,70.0 ,1,"정보시스템공학과");
	arr[1] = new Student("이영희",23,167.0,54.0,4,"물리학과");
	arr[2] = new Student("홍길동",21,197.6,86.0,2,"경영학과");
	
	for(Student s : arr) {
		System.out.println(s);
	}
	
	
	
	
	
	
	
	}

}
