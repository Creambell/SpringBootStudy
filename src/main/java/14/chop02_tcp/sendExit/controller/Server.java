package com.kh.exapmle.chop02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void startServedr() {
	
		try {
			// 1. 서버 포트번호 저장
			int port = 9090;
			
			// 2. 서버용 소켓(ServerSocket) 객체 생성 후 포트 결합
			ServerSocket server = new ServerSocket(9090);
			
			// 3. 클라이언트로부터 접속 요청이 올때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있어요...");
			
			// 4. 접속 요청이오면 수락후 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept(); // 요청받을 객체 제작
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + " 가 연결을 요청함...");
			
			// 5. 연결된 클라이언트와 입출력 스트림 생성
			// 6. 보조스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			
			// 7 . 스트림을 통해 읽고 쓰기
			while(true) {
				String message = br.readLine();
				
				if(message.equals("exit")) {
					System.out.println("접속 종료"); // 성공시에 나가는 break 안써주면 close로 외부에서 못닫음 주의
					break;
				}else {
					System.out.println(clientIP + " 가 보낸 메세지 :" + message);
					pw.println("메세지 받기 성공");
					pw.flush();
					
				}
				
			}
		
			// 8 . 통신 종료
			pw.close();
			br.close();
			server.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
}
