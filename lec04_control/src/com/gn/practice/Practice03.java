package com.gn.practice;
import java.util.Scanner;
public class Practice03 {
//	철수네 학교는 두발 검사가 있는 학교에요.
//	여학생은 귀밑 7cm, 남학생은 귀밑 3cm를 원칙으로 삼고 있어요.
//	학생의 성별과 머리 길이를 키보드로 입력 받아서
//	합격, 불합격 여부를 출력하는 프로그램을 만들어주세요.
//	여학생은 머리 길이가 7cm 이하이면 합격이고,
//	남학생은 3cm 이하이면 합격입니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) :");
		char gender = sc.next().charAt(0);
		System.out.print("머리(cm) :" );
		int hair = sc.nextInt();
		if('F' == gender) {
			if(hair <= 7) {
				System.out.println("합격"); // F && 7과 같거나 작으면 합격
			}else {
				System.out.println("불합격"); // F && 7보다 높으면 불합격
			}
		}
			else { // F가 아니면
			
				if(hair <=3) {
					System.out.println("합격"); // 3과 같거나 작으면 합격
			}else{
					System.out.println("불합격"); // 3보다 높으면 불합격
			}
			
		}
		
		
			
		
	
	
		
		
	
	}
}
