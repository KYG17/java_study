package Practice01.run;

import Practice01.model.vo.Employee;
import Practice01.model.vo.Person;
import Practice01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Person[] arr = new Person [2]; // => Person p 에 배열 크기 2를 생성
		
		
		Student st = new Student();
		arr[0] = st;					//index 0번에 student 객체 생성 & 값 초기화
		arr[0] = new Student();
		
		Employee em = new Employee();
		arr[1] = em;					//index 1번에 employee 객체 생성 & 값 초기화
		//arr[1] = new Employee();
		for(Person a : arr) {
			a.introduce(); //=> introduce 메소드를 호출
			
		}
		
		
		
//		Person d = new Student();
//		Person e = new Employee();
//		
//		d.introduce();
//		e.introduce();
		
		
		



	}

}
