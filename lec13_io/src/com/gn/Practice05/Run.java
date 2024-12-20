package com.gn.Practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"애국가1.dat");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte [] a = new byte[(int)file.length()];
			int idx = 0;
			int c;
			while(true) {
				c = fis.read();
				if(c == -1) break;
				a[idx++] = (byte)c;
			}
			
			String str = new String(a);
			System.out.println(str);
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if( fis != null) {
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
