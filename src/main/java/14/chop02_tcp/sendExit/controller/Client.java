package com.kh.exapmle.chop02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		
	
	// 0 . 서버의 ip주소와 포트번호 알아내기
	// 1. 서버의 ip주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
	try {
		Socket socket = new Socket("192.168.40.32",9090);
		
		if(socket != null) {
			// 2. 서버와의 입출력 스트림 오픈
			// 3. 보조스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			do{
				// 4. 스트림을 통해 읽고 쓰기
				System.out.println("대화 입력 : ");
				String message = sc.nextLine();
				
				pw.println(message);
				pw.flush();
				
				if(message.equals("exit")) {
					break;
				}
				
				System.out.println(br.readLine());
			}while(true);
			// 5. 스트림 닫기
			br.close();
			pw.close();
			socket.close();
		}
		
		
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	}
}
