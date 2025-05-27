package com.kh.example.chop03_assist.part01_buffer.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDAO {
	public void inputByte() {
		// 파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다
		// File				Steam			Input=>FileInputStream
		//							Buffered	=>BufferdInputStream
		try(FileInputStream fis = new FileInputStream("c_buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			int value;
			while((value = bis.read()) != -1) {
				System.out.print((char)value);
			}

//			int size = (int)new File("c_buffer.txt").length();
//			 틀린 식
//			byte[] bArr = new byte[size];
//			bis.read(bArr);
//			for(int i =0; i<bArr.length;i++) {
//				System.out.print(bArr[i] + " ");
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
	public void outputByte() {
		//파일에 바이트 기반으로 데이터를 빠르게 쓰고 싶다
		//File		Steam			Output
		//							Buffered BufferdOutputStream
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c_buffer.txt",true));)
			{ // 인자 뒤에 true를 쓰면 덮어쓰지않고 이어쓰기가 됌
			bos.write(65);;
			
			byte[] bArr = {66,67,68,69};
			bos.write(bArr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
	
	public void outputChar() {
		// 파일에 문자 기반으로 데이터를 빠르게 쓰고 싶다
		// File					Buffered			Writer
		try(FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void inputChar() {
		//파일에 문자 기반으로 빠르게 데이터를 읽고 싶다
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c_buffer.txt"));
			String vaule;
			while((vaule=br.readLine()) != null) {
				System.out.print(vaule);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void scannerEX() {
		
		try(//System.in은 바이트기반인데 reader은 문자기반
				//바이트를 문자로 바꿔주는건 INPUTSTREAMREADER
				//기반에 보조에 보조를 감쌈 기반 = System.in
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
			) {
			System.out.print("정수 한 개를 입력하세요 : ");
			String input = br.readLine();
			int number = Integer.parseInt(input);
			
			System.out.print(number + "은(는) ");
			if(number % 2 == 0) {
				System.out.println("짝수입니다");
			}else {
				System.out.println("홀수");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
