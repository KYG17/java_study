package com.study.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
//		ArrayList에 초기좌석 A2, A1, B2, B1를 추가합니다.
//		ArrayList의 초기 좌석 정보를 추가한 후(1) 출력하세요.
//		영화관 좌석중에서 3번째 좌석에 A3 좌석을 추가합니다.
//		그 다음, 영화관 좌석 목록을 출력하세요.
//		예약하고 싶은 좌석의 정보를 키보드로 입력받습니다.
//		만일 사용자가 입력한 좌석이 존재하는 좌석이라면 해당 좌석의 정보뒤에 (예약)이라는 문자열을 추가해주세요.
//		삭제하고 싶은 좌석의 정보를 키보드로 입력받습니다.
//		만일 사용자가 입력하는 좌석이 존재하는 좌석이라면 해당 좌석을 제거한 후 목록을 출력해주세요.
//		마지막으로 오름차순 정렬한 후에 출력합니다.
		
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B2");
		seats.add("B1");
		System.out.println("초기 좌석 목록 : " +seats);
		
		seats.add(2,"A3");
		System.out.println("A3 좌석 추가 후 : " +seats);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String a = sc.next();
		
		int idx = seats.indexOf(a);
		if( idx != -1) {
			//A3 -> 2 -> 2번을 A3(예약)
			//B2 -> 3 -> 3번을 B2(예약)
			seats.set(idx, a + "(예약)" );
		}else {
			System.out.println(a + "는(은) 존재하지않습니다");
		}
		
		System.out.print("삭제 좌석 : ");
		String b = sc.next();
		int idc = seats.indexOf(b);
		if( idc == -1) {
			System.out.println("존재하지 않는 좌석입니다");
		}
		seats.remove(b);
		System.out.println(seats);
		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 :" + seats);
	
		
		
	}

}
