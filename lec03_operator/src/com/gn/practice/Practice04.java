package com.gn.practice;
import java.util.Scanner;
public class Practice04 {
public static void main(String[] args) {
	//철수가 여권을 만들려고 합니다.
	//영어 이름 : Chulsu
	// 그리고
	//20대 이신가요?
	//1. 철수의 영어 이름과 나이 정보를 입력받습니다
	//2. 3가지 논리형 데이터를 출력
	//(1) 영어 이름이 일치하나요? true
	//(2) 20대 인가요? false
	//(3) 영어 이름이 일치하면서 동시에 20대 인가요?
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 : ");
	String a = sc.next();
	System.out.print("나이 : ");
	int b = sc.nextInt();
	String c = "Chulsu";
	boolean name = a.equals(c);
	boolean age = b < 30 && b <= 29;
	System.out.println("영어 이름이 일치하나요?" + name);
	System.out.println("20대 인가요?" + age);
	boolean na = name && age ;
	System.out.println("영어 이름이 일치하면서 동시에 20대 인가요?" + na);
}
}
