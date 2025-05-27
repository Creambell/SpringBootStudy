package com.kh.example.chop00_file.contrtoller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
			File f1 = new File("test.txt"); // 파일 객체 생성
			f1.createNewFile(); // 경로를 안써주면 프로젝트 최상단이 경로로 잡힘.
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile(); // 파일만 만들어줌
			
			File f3 = new File("c:/temp1/temp2");
			File f4 = new File("c:/temp1/temp2/test.txt");
			f3.mkdirs(); // 폴더만 생성해주는 것
			f4.createNewFile(); // 경로에 폴더 파일생성
			f4.delete(); // 삭제
			
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			System.out.println(f3.isFile()); // 파일이 아니라 폴더라 false
			System.out.println("파일 명 : "+f1.getName());
			System.out.println("저장 절대 경로 : "+f1.getAbsolutePath());
			// 무조건 위치
			System.out.println("저장 상대 경로 : "+f1.getPath());
			// 위치가 바뀔수도있음
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("상위 폴더 : " + f4.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
