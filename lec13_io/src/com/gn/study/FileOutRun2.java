package com.gn.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun2 {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\241219");
		if(dir.exists() == false) {
			dir.mkdir();
			System.out.println("생성 성공");
		}
		File file = new File(dir,"sample2.dat");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file, true);  //추가는 선언과 동시에 ,true를 함게 써주면 바이트 데이터 추가.
			String str = "안녕하세요~ 반갑습니다\n";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
				
			
		}	catch(IOException e) {
			e.printStackTrace();
		}
	}

}
}