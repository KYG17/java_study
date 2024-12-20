package com.gn.Practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {


//		output.txt 파일 안에 아래 배열의 요소를 한 줄에 하나씩 추가해주세요.


//		C:\\test\\sub폴더 아래에 practice폴더를 생성하세요.
		File dir = new File("C:\\test\\sub\\pratice");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
//		practice폴더 아래에 output.txt 파일을 생성하세요.
		File file = new File(dir,"output.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};
			bw.write(lines[0]);
			bw.newLine();
			bw.write(lines[1]);
			bw.newLine();
			bw.write(lines[2]);
			
		
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
