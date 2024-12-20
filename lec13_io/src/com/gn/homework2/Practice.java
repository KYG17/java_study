package com.gn.homework2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {
	
	public void meThod1(File file) {
		try(FileInputStream fs = new FileInputStream(file)) {
			byte [] a = new byte[(int)file.length()];
			int idx = 0;
			int c ;
			while(true) {
				c = fs.read();
				if(c == -1) break;
				a[idx++] = (byte)c;
			}
			String str = new String(a);
			System.out.println(str);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void meThod2(File file) {
		try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file))){
			byte [] b = new byte[(int)file.length()];
			byte[] stand = new byte[5];
			int idx = 0;
			while(true) {
				int data = bi.read(stand);
				if(data == -1) break;
				System.arraycopy(stand, 0, b, idx, data);
				idx += data;
			}
			String result = new String(b);
			System.out.println(result);
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
