package com.gn.practice05.book;

public class Book {
	
		private String title;
		private String publisher;
		private String author;
		private int price;
		private double discountRate;
		
		//기본 생성자 -> 매개변수 x
		public Book() {
		}
		
		//매개변수가 3개 있는 생성자
		public Book(String title, int price, String author) {
			this.title = title;
			this.author = author;
			this.price = price;
		}
		
		public Book(String title, String author, String publisher, int price, double discountRate) {
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
			this.discountRate = discountRate;
			
		}
		
		public void information() {  // 메소드 -> 출력기능
			System.out.println("===" + title + "===");
			System.out.println("저자 : " + author);
			System.out.println("출판사 :" + publisher);
			System.out.println("가격 : " + price + "원");
			System.out.println("할인율 : " + discountRate);
		}
		

	

}
