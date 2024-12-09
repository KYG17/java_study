package Practice03.model.vo;

public class Vehicle {
	private int wheel;
	
	public Vehicle () {};  //기본 생성자
	
	public Vehicle (int wheel) { //매개 변수 생성자
		this.wheel = wheel;
	}
	
	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public void go() {
		System.out.println("지나가요!!!");
	}

}
