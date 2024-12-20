package com.gn.practice01;

import java.io.File;
//C:\\test\\sub 
public class Practice {
public void deleteFile(File dir) {
	if(dir.isDirectory()) {
		File[] files = dir.listFiles();
		if(files != null) {
			for(File f : files) {
				f.delete();
				System.out.println(f.getName()+ "삭제");
			}
		}
	} 
}
}


