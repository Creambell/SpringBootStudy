package com.kh.example.chop02_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		// 데이터를 파일에 문자단위로 쓰고싶다
		try(FileWriter fw = new FileWriter("b_char.txt");) {
			fw.write("와 IO 재밌다");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public void fileOpen() {
		// 파일로부터 문자단위로 데이터를 읽어오고 싶다
		try(FileReader fr = new FileReader("b_char.txt");) {
//			while(fr.read() != -1) {
//				System.out.print((char)fr.read()+ " ");
//			}  변수를 안넣고 만들면 read를 두번읽어서 이상하게 출력됨
//			int value;
//			while((value = fr.read()) != -1) {
//				System.out.print((char)value+ " ");
//			}
			
			
			File f = new File("b_char.txt");
			int size = (int)f.length();
			char[] chArr = new char[size];
			fr.read(chArr);
			for(int i = 0; i <chArr.length;i++) {
				System.out.print(chArr[i] + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
}
