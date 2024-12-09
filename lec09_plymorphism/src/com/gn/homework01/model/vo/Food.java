package com.gn.homework01.model.vo;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {}
	
	public Food(String name, int price, int expirationDays) {
		super(name,price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if (expirationDays <= 1) {
			return (getPrice() * (100-20) / 100);
		}else if(expirationDays <= 5) {
			return (getPrice() * (100-50) / 100);
		}else if(expirationDays <=10) {
			return(getPrice() *(100-20) / 100);
		}else {
			return 0 ;
		}
	
	}		
		}
	
	
	
		
	
	
	

	


