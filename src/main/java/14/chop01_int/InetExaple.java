package com.kh.exapmle.chop01_int;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExaple {

	public static void main(String[] args) {
		
		try {
			InetAddress localIP = InetAddress.getLocalHost();
			// InetAddress 참조자료형이라 주소값을 가지고 있어야함.
			// localIP의 주소값이 안뜨고 이름과 데스크톱이 뜨는건 toString이 오버라이딩 됌
			
			System.out.println("localIp : " + localIP);
			System.out.println("내 pc명 : " + localIP.getHostName());
			System.out.println("내 ip : " + localIP.getHostAddress());
			
			InetAddress khIP = InetAddress.getByName("www.kh-academy.co.kr");
			System.out.println("kh 서버 명 :" + khIP.getHostName());
			System.out.println("kh 서버 ip : " + khIP.getHostAddress());

			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + googleIPs.length);
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 :" + naverIPs.length);
			for(int i = 0; i<naverIPs.length;i++) {
				System.out.println("네이버 IP : " + naverIPs[i].getHostAddress());
			}
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
