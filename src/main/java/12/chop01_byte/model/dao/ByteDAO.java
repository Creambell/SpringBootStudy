package com.kh.example.chop01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		//파일로부터 byte단위로 데이터를 읽어오고 싶다
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
//			 fis = new FileInputStream("a_byte.txt");
//			// 1. 파일 크기를 가져와 배열을 만들어 저장 후 출력
//			int fileSize = (int)new File("a_byte.txt").length();
//			byte[] bArr = new byte[fileSize];
//			fis.read(bArr);
//			for(int i = 0; i <bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
//			
	
//		 2. 파일을 읽어옴과 동시에 출력
			int value;
			while((value =fis.read()) != -1) { // read는 데이터를 읽어와서 반환
				System.out.print((char)value + " ");
				
			}
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
	
	public void fileSave() {
		//파일에 byte단위로 데이터를 작성하고 싶다
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");) {
			fos.write(97);
			
			byte[] bArr = {98,99,100,101,102,103};
			fos.write(bArr);
			fos.write(bArr,1,3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
}
