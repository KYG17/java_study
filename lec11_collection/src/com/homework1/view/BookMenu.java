package com.homework1.view;

import java.util.Scanner;

import com.homework1.controller.BookController;
import com.homework1.model.vo.Book;

public class BookMenu {
	

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		
		System.out.println("==가남 도서관에 오신걸 환영합니다==");
		System.out.println("원하시는 업부의 번호를 선택하세요");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : insertBook();
			break;
		case 2 : selectList();
			break;
		case 3 : searchBook();
			break;
		case 4 : deleteBook();
			break;
		case 5 : ascBook();
			break;
		case 9 : System.out.println("프로그램을 종료합니다");
			break;
		default : System.out.println("잘못 입력하엿습니다. 다시 입력해주세요");
	
		}

		
		

		
	}
	
	public void insertBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 : ");
		String b = sc.next();
		System.out.print("저자명: ");
		String c = sc.next();
		System.out.print("장르를 입력하세요 (1:인문 2:자연과학 3:어린이 그 외: 기타) :");
		int x = sc.nextInt();
		String categoryName;
		System.out.print("가격: ");
		int y = sc.nextInt();
		
		switch(x) {
		case 1: categoryName = "인문";
		case 2: categoryName = "자연과학";
		case 3: categoryName = "어린이";
		default: categoryName = "기타";
		
//		Book book = new Book(name,author,categoryName,price); 
		}
		
		
		
		
	}
	
	public void selectList() {
		
	}
	
	public void searchBook() {
		
	}
	
	public void deleteBook() {
		
	}
	
	public void ascBook() {
		
	}
	
	

}
