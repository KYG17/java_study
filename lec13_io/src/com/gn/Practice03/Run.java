package com.gn.Practice03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		//1. 디렉토리
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) { //없으면 만들어줘
			dir.mkdir();
		}
		
		//2. 파일 생성
		File file = new File(dir,"애국가1.dat"); // dir 디렉 안에 애국가1.dat 파일생성
		
		//3. FileOutputStream
		FileOutputStream out = null; //try~catch 밖에다 선언
		try {
			out = new FileOutputStream(file); //터널 생성 뭘 들고 터널 지나가? file!
			String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
					+ "\n우리나라 만세 무궁화 삼천리 화려강산"
					+ "\n대한사람 대한으로 길이 보전하세"; //file 안에다가 이걸 적을거야
			byte [] arr = song.getBytes(); // file 안에 바이트 배열 생성
			out.write(arr); // file 안에 작성
			out.flush(); //선택 사항
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally { //finally 안에다가 out 출력 try~catch
			try {
				if(out != null) {
					out.close();
				}
			}catch(IOException e) {
					e.printStackTrace();
			}
			
		}
		

	}

}
