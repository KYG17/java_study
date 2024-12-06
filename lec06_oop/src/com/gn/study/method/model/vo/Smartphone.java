package com.gn.study.method.model.vo;

public class Smartphone {
	// 1. 반환형x, 매개변수 x -> 앱 열림 메시지
	public void openapp() {
		System.out.println("앱이 열렸습니다.");
	}
	// 2. 반환형o, 매개변수x -> 배터리 잔량 리턴
	public int checkBattery() {
		return 23;
	}
	
	// 3. 반환형x, 매개변수o ->볼륨 입력하면 출력
	public void setVolume(int volume) {
		System.out.println("볼륨이" + volume+ "으로 설정되었습니다");
	}
	
	// 4. 둘 다 있는경우 ->메시지 전송
	public String sendMsg(String Msg) {
		return "메시지\'"+Msg+"\'가 전송되었습니다.";
		
	}
	
	public void checkWork() {
		Hospital hospital = new Hospital();
		hospital.emergencyCall();
		hospital.doctorCall();
		hospital.staffAnnouncement();
//		hospital.personalRecord();
	}

}
