package com.gn.practice12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

//		- 키보드로 값을 입력 받습니다.
//		- 입력받은 값이 y또는 Y일 경우 기준 시간값으로부터 경과 시간(초)를 출력합니다.
//		- 입력받은 값이 n또는 N일 경우 기능을 종료합니다.
//		- 입력받은 값이 그 외의 경우 “다시 입력해주세요.”라고 출력합니다.

		
		
		
//		- 처음 시스템을 실행했을 때 시간값을 LocalTime 타입 변수 start에 담으세요.
		LocalTime start = LocalTime.of(8,51,22);
		LocalTime end = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
//		- start 변수의 값을 출력 예시와 같이 출력합니다.
		System.out.println("기준 : " + start.format(dtf));
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String a = sc.nextLine();
		if(a.equals("n") || a.equals("N")) {
			System.out.print("종료합니다");
			break;
		}else if(a.equals("y") || a.equals("Y")){
			long seconds = ChronoUnit.SECONDS.between(start, end);
			System.out.println("경과(초) : " + seconds);
		}else {
			System.out.println("다시 입력 하세요");
			
		}
	}
	}
}
