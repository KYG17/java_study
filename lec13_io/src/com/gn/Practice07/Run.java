package com.gn.Practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File file = new File("C:\\test\\sub\\pratice\\output.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			StringBuilder sb = new StringBuilder();
			int a = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				sb.append(data).append("\n");
				a = a + data.replace(" ","").length();
			}
			System.out.println(sb.toString());
			System.out.println("공백 제외 글자 수 : " + a);
			System.out.println("글자 수 : " + sb.toString().length());
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		

	}

}
