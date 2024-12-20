package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun1 {
	public static void main(String[] args) {
		//1. 파일 위치 지정 -> 있는 걸 가져와요
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "sample1.dat");
		
		//2. 파일 입력 스트림 선언
		FileInputStream in = null;
		
		//3. 피일 입력 스트림 생성
		try {
			in = new FileInputStream(file);  //=> FileInputStream 매게변수로 파일의 위치를 지정
			//4. 읽은 데이터를 보관할 배열 -> 아직 안읽음
			byte[] b = new byte[(int)file.length()]; //-> (1)파일 크기만한 비어있는 배열 생성
			int idx = 0;
			//5. 읽어오기 -> 4번 배열에 넣을거야
			int c ; //  -> (2) 읽어올 데이터 담을 변수
			while(true) { // -> (3) 반복문을 통해서 파일 내부 정보 읽어옴
				c = in.read(); // -> c가 in.read()로 바뀜
				if(c == -1) break; // => c 가 다 읽으면 끝(=break) 
				b[idx++] = (byte)c; // => c 가 잘 돌아가면 배열에 넣을거에요
			}
			
			//6. 확인하기
			System.out.println(b);
			String str = new String(b);
			System.out.println(str);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		
		//7. 닫아주기	
		}finally {
			try {
				if(in != null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
