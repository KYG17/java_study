package com.gn.practice01.model.vo;

public class Manager extends Employee {
	private String department;
	
	public Manager () {};
	
	public Manager(String name, String department) {
		super(name); // -> 부모의 것도 넣어줘야함 super(매개변수)
		this.department = department;
	} //부모의 매개변수도 넣어줘야함
	
	public void printDepartment() {
//		super.printInfo();  --> super.활용 Employee의 printInfo를 가져옴
		System.out.println("담당 부서: " + department);
	}

}
