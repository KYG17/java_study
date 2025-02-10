package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;
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
	
	Employee[] arr1 = new Employee[10];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("===사원 입력 받기===");
	while(true) {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		arr1[count++] = new Employee(name,age,height,weight,salary,dept);
		
		System.out.print("계속 추가하시겠습니까 ? ");
		String answer = sc.nextLine();
		
		if("N".equals(answer)||"n".equals(answer)) {
			break;
			}
		}
	
	
		for(int i = 0 ; i < count ; i++) {
		System.out.println(arr1[i].toString());
			
	}
	
	
	
	
	
	
	}

}
