package Practice04.model.vo;

public class LoginMenu extends AppFeatures {
	
	@Override
	public void display() { //추상 메소드를 부모한테 받으면 반드시 구현
		System.out.println("로그인 화면이 출력됩니다");
	}
	
	@Override
	public void input() {  //추상 메소드를 부모한테 받으면 반드시 구현
		System.out.println("사용자 정보를 입력받습니다");
	}

}
