package Practice04.model.vo;

public abstract class AppFeatures {
	
	public abstract void display(); // -> 추상 메소드
	
	public abstract void input(); // -> 추상 메소드
	
	public void close() {
		System.out.println("기능을 종료합니다");
	}
	

}
