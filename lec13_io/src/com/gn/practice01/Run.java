package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;

public class Run {

	public static void main(String[] args) {
//		C 드라이브 아리에 test\sub 디렉토리를 생성하세요.
//		그리고 아래와 같이 test\sub 경로에 오늘 날짜 이름의 디렉토리를 생성하세요.
//		오늘 날짜 정보는 LocalDate를 통해서 가져옵니다.
//		C:\\test\\sub\\2024\\12\\18
//		해당 디렉토리가 없을 때만 생성될 수 있도록 조건문을 반드시 추가하세요.
//		2) 출력 예시
//		상황에 맞게 아래의 문장을 출력하세요.
//		디렉토리 생성 성공
//		디렉토리 생성 실패
//		이미 존재하는 디렉토리
		
//		LocalDate date1 = LocalDate.now();
//		int a =date1.getYear();
//		int b = date1.getMonthValue();
//		int c = date1.getDayOfMonth();
//		File dir1; // -> file 객체 선언
//		dir1 = new File("C:\\test\\sub" +"\\"+a+"\\"+b+"\\"+c);
//		
//		dir1.mkdirs();
//		
//		if(!dir1.exists()) { //dir1 디렉토리가 존재하지 않는다면
//			dir1.mkdirs();
//			if(dir1.mkdirs()) {
//				System.out.println("디렉토리 생성 성공"); // 만들고 생성 성공 출력
//			}else {
//				System.out.println("디렉토리 생성 실패");
//			}
//				
//			}else {
//				System.out.println("이미 존재하는 디렉토리");
//			}
//		
		Practice p = new Practice();
		File dir = new File("C:\\test\\sub");
		p.deleteFile(dir);
		

	}

}
