package com.gn.study.controller;

import java.io.File;
import java.io.IOException;

public class Practice01 {
	public static void main(String[] args) {
		String filePath1 = "C:\\parentDir\\childDir\\exampleFile.txt";
		File file1 = new File(filePath1);
		try {
		    if (file1.createNewFile()) { 
		        System.out.println("파일 생성 성공");
		    } else { 
		        System.out.println("이미 존재하는 파일");
		    }
		} catch (IOException e) {
		    System.out.println("파일 생성 중 오류 발생");
		    e.printStackTrace();
		}

	}

}
