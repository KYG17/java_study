package com.gn.homework1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
//	- 기능 제공용 클래스 Practice를 생성하세요.
//	- 실행용 클래스 Run을 생성합니다.
//	- Practice에는 노래 가사를 매개변수로 받는 2개의 메소드가 있습니다.
//	- method1
//	    - FileOutputStream만 사용하여 `C:\\test\\sub` 폴더에 파일 생성
//	    - 파일명 “나비야1.dat”
//	- method2
//	    - BufferedOutputStream을 함께 사용하여`C:\\test\\sub` 폴더에 파일 생성
//	    - 파일명 “나비야2.dat”
//	
	
	public void method1(String song) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdir();
		}
		File file = new File(dir,"나비야1.dat");
		
		
		
		try(FileOutputStream a = new FileOutputStream(file)) {
			
			String str = song;
			byte[] arr = str.getBytes();
			
			a.write(arr);
			
		
			
		}
		catch(IOException e){
			e.printStackTrace();
		}	
	}
	
	public void method2(String song) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdir();
		}
		File file = new File(dir,"나비야2.dat");
		
		try(BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(file))) {
			String str = song;
			byte[] arr =str.getBytes();
			bs.write(arr);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
