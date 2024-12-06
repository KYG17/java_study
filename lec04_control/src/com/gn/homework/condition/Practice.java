package com.gn.homework.condition;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Practice a = new Practice();
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		
		for(int x = 2 ; x <= 9 ; x++) {
			
			System.out.println("==="+x+"단===");
		
			for(int j = 1 ; j <= 9 ; j++) {	
				System.out.println(x+"*"+j + "=" + x*j);
				
				}
			}
		}
		

	}


