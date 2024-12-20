package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		//1.디렉토리
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) { //존재하지 않는다면 디렉토리를 만들어주세요
			dir.mkdirs();
		}
		//2. 파일 생성
		File file = new File(dir,"sample1.dat"); // 위에 있는 dir 안에 파일을 생성할래요 
		//3. FileOutputStream -> try~catch로 surround
		FileOutputStream out = null; //선언은 밖에서 그래야 try문 안에서 out을 선언할 수 있음
		try {
			out = new FileOutputStream(file); // 생성은 안에서
			//4.출력할 데이터 구성
			String str = "Hello";
			byte [] arr = str.getBytes(); // hello라는 애를 잘라서 배열 형태로 만듬
			//5. 출력
			out.write(arr);
			//6. 플러싱 (선택사항) // 청소를 하고 닫아주자
			out.flush();
			System.out.println(file.length() + "크기의" + file.getParent() + "파일 생성"); 
			
		} 
		catch (IOException e) {
			e.printStackTrace(); 
		}finally { // => out.close는 finally 안에다가
			try {
				//7. 스트림 닫기
				if( out != null) {
					out.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
