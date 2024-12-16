package com.study.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.study.practice09.model.vo.Information;

public class Run {
//	아래 사용 데이터를 참고하여 HashMap에 직원들의 정보를 추가합니다.
//	직원들의 정보 중 이름은 Key값으로 사용되고, 전화번호와 월급은 Information클래스의 필드로써 Value에 사용됩니다.
//	HashMap을 출력하세요.
//	John의 월급을 410만원으로 바꾸어 HashMap의 값을 바꾼다음 다시 출력하세요.
public static void main(String[] args) {
	

	Map<String,Information> information = new HashMap<String,Information>();
	information.put("Tom", new Information(555+"-"+123+"-"+4567,460000));
	information.put("Emma", new Information(987+"-"+654+"-"+3210,2300000));
	information.put("John", new Information(123+"-"+456+"-"+4567,3800000));
	System.out.println(information);
	
	information.get("Emma").setPhone(111+"-"+111+"-"+1111);
	System.out.println(information);
	System.out.println("===Emma의 정보===");
	System.out.println("전화번호 : " + information.get("Emma").getPhone());
	System.out.println("월급 : " + information.get("Emma").getSalary());
	
	                           
	
	//중복
	information.put("John", new Information(123+"-"+456+"-"+4567,4100000));
	System.out.println(information);
	

}
	}
	



