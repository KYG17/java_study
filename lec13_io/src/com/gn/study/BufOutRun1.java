package com.gn.study;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufOutRun1 {

	public static void main(String[] args) {
		//1. 디렉토리 생성
		File dir = new File("C:\\test\\sub\\20241219");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		//2. 파일 객체 생성
		File file = new File(dir, "sample3.dat");
		
		//3. 스트림 생성
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file); //터널   터널이 있어야 엘레베이터가 들어감
			bos = new BufferedOutputStream(fos); // 매개변수 fos     buffer ==> 엘레베이터
			
			String str = "how are you \n" + "I'm fine thank you ";
			bos.write(str.getBytes()); // => 다이렉트로 쓸 수 있다
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { // ===> close 할 때는 터널에서 엘레베이터가 먼저 나와야 하니 buffer 먼저 close
				if(bos != null) {
					bos.close();
					if(fos != null) {
						fos.close();
					}
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		

	}

}
