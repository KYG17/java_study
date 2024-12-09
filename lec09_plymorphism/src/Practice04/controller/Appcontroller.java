package Practice04.controller;

import Practice04.model.vo.AppFeatures;
import Practice04.model.vo.LoginMenu;

public class Appcontroller {
	public void startMyApp() {
		AppFeatures a = new LoginMenu();
		a.display();
		a.input();
		a.close(); //부모 메소드 그대로 호출
	}

}
