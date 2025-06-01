package com.kh.exapmle.chop02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void startClient() {
		// 0 . 서버의 ip주소와 서버가 정한 포트번호 알아내기
		int port = 8500;
		try {
			//원래대로면 서버와 클라컴이 분리되어있지만 우리는 그럴수없어서 정해줌.
			//그래서 ip주소가 같을수밖에 없음 지금으로서는
			
			String serverIP = InetAddress.getLocalHost().getHostAddress();
								//내 ip 주소임 문제때는 다른 ip주소면쓰면안됌
// 1. 서버의  ip주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			Socket socket = new Socket(serverIP,port);
			if(socket != null) { // 서버와의 연결이 성공했을 때
				// 2. 서버와의 입출력 스트림
				// 3. 보조 스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4. 스트림을 통해 읽고 쓰기
				pw.println("반가워요");
				pw.flush();
				
				System.out.println(br.readLine());
				
				// 5. 통신 종료
				pw.close();
				br.close();
				
				socket.close();
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
