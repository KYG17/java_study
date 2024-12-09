package Practice02.model.vo.run;

import Practice02.model.vo.SchoolMember;
import Practice02.model.vo.Staff;
import Practice02.model.vo.Student;
import Practice02.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		SchoolMember[] arr = new SchoolMember[3];
		
		arr[0] = new Student();
		arr[1] = new Teacher();
		arr[2] = new Staff();
		
		for(SchoolMember a : arr) {
			a.introduce(); // => [0][1][2] 가 가지고 있는 introduce 출력
			if(a instanceof Student) {
				((Student)a).study();
			}else if(a instanceof Teacher){
				((Teacher)a).teach();
			} else  {
				((Staff)a).work();
			}
			
		}
		
	

	}

}
