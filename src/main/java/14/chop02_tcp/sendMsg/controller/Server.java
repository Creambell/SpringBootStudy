package com.kh.exapmle.chop02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void startServer() {
		// 1. 서버의 포트번호 정하기
		int port = 8500; // 0~655535 까지 가능 1023이하느 사용 지향
		
		// 2 . 서버용 소켓 객체 생성 후 포트와 결합
		try {
			ServerSocket server = new ServerSocket(port); // 매개변수에 포트번호
		// 3 . 클라이언트 접속 요청 기다림
			System.out.println("클라 요청을 대기중 ...");
		// 4 . 접속 요청이 오면 요청수락후 해당 클라이언트에 대한 소켓 객체 생성
		Socket client = server.accept();
		String clientIP = client.getInetAddress().getHostAddress();
		System.out.println(clientIP + " 가 연결을 요청함...");
		
		// 5 . 연결된 클라이언트와 입출력 생성
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		// 6. 보조스트림을 통해 성능 개선
		BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
					// 바이트기반을 문자기반으로 변경해주는 함수
		PrintWriter pw = new PrintWriter(out);
		
		// 7. 스트림을 통해 읽고 쓰기
		String message = br.readLine(); // 클라이언트->서버 보낸 메세지를 읽어들임.
		System.out.println(clientIP + "가 보낸 메세지 : " + message);
		
		pw.println("만나서 반갑습니다."); // 서버에서 클라이언트로 메세지 전송
		pw.flush();
		
		// 8. 통신종료
		pw.close();
		br.close();
		server.close();
		
		
		} catch (IOException e) {			//그럼 포트와 결합
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
