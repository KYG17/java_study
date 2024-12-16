
package com.study.controller;

//util안에 있는 클래스를 모드 가져오겠다 '*' 표시
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.study.model.vo.Container;
import com.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//Boxing
		Integer inum = 100;
		
		//Unboxing
		int num = inum;
		
		//parse메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2); 
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		
		str2 = "1.34";
		System.out.println(str2+str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3);
		
		System.out.println("====================================================");
		
		//NumerFormatException
		try {
		String[] arr= new String[3];
		arr[0] = "일";
		int arrNum = Integer.parseInt(arr[0]);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");
		
		System.out.println("====================================================");
		
		//ClassCastException
		try {
		Object o = 9;
		String oStr = (String)o;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");
		
		
		System.out.println("====================================================");
		//제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);
		System.out.println(con.getItem());
		Container<String> tain = new Container<String>();
		tain.setItem("안녕하세요");
		System.out.println(tain.getItem());
		
		System.out.println("====================================================");
		//List(ArrayList)
		
		//1.선언과 생성
		List<String>list = new ArrayList<String>();
		
		//2.추가
		List<String>meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal);
		
		System.out.println("====================================================");

		
		meal.add(1, "간식");
		System.out.println(meal);
		
		System.out.println("====================================================");

		
		//3. 삭제
		meal.remove(1);  //=>인덱스 기준으로 1번을 지울래요
		System.out.println(meal);
		
		meal.clear();
		System.out.println(meal);
		
		System.out.println("====================================================");

		
		//4. 요소변경
		List<Integer>nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		nums.set(1,500);
		System.out.println(nums);
		
		System.out.println("====================================================");

		
		//5. 요소 조회
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		
		for(int i = 0 ; i < nums.size() ; i++) {
			System.out.println(i + " : "+ nums.get(i));
		}
		
		
		for(Integer n : nums) {
			System.out.println(n);
			
			

		}
		
		//6.ArrayList 정렬
		System.out.println("정렬전 : " +nums);
		Collections.sort(nums); //오름차순 정렬 코드
		System.out.println("오름차순 정렬후 : " + nums); //오름차순 출력
		Collections.sort(nums, Collections.reverseOrder()); // 내림차순 정렬 코드
		System.out.println("내림차순 정렬후 : " + nums); //내림차순 출력
		
		System.out.println("====================================================");

		
		//7.ArrayList<객체>
		List<Student> students = new ArrayList<Student>();	
		students.add(new Student("김철수",50));
		System.out.println(students);
		
		if(students.contains(new Student("김철수",50))) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		if(students.indexOf(new Student("김철수",50)) != -1) { //들어가있다면
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		System.out.println("====================================================");

		students.add(new Student("이영희",40));
		students.add(new Student("홍길동",30));
		System.out.println("정렬 전 : " + students);
		Collections.sort(students);
		System.out.println("정렬 후 :" + students);
		
		
		System.out.println("==================================Hash set ================================================");
		
		Set<String> city = new HashSet<String>();
		city.add("서울");
		city.add("부산");
		city.add("광명");
		System.out.println(city);
		//중복 데이터 추가 시도
		city.add("서울");
		System.out.println("서울");
		
		System.out.println("---for each---");
		for(String str : city) {
			System.out.println(str);
//			city.remove(str);
//			if(city.size() == 0) {
//				System.out.println("여기가 마지막");
//			}
		}
		//삭제
		city.remove("서울");
		System.out.println("삭제 후: " + city);
		city.clear();
		System.out.println("비우기: " + city);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수",30));
		set1.add(new Student("이영희",40));
		set1.add(new Student("홍길동",50));
		set1.add(new Student("김철수",30));
		
		System.out.println(set1);
		
		set1.remove(new Student("김철수",30)); //삭제
		System.out.println(set1);
	}

}
