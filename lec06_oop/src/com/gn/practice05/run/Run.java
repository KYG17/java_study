package com.gn.practice05.run;
import com.gn.practice05.book.Book;
import com.gn.study.constructor.model.vo.Student;

public class Run {
	// final -> 대문자
	// static -> 밑줄

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.information();
		
		Book book2 = new Book ("홍길동전", 5000 , "허균");
		book2.information();	
		
		Book book3 = new Book ("채소 과일 레시피", "박경희", "터치아트", 19300, 0.1);
		book3.information();
		
		

	}

}
