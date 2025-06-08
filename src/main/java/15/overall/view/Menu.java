package com.kh.overall.view;

import java.util.Scanner;

import com.kh.overall.member.view.MemberMenu;

public class Menu {

	public static Scanner sc = new Scanner(System.in);
	private MemberMenu mm = new MemberMenu();
	
	public void mainMenu(){
		Scanner sc = new Scanner(System.in);
		MemberMenu mm = new MemberMenu();
		int num = 0;
		while(num !=9) {
			System.out.println("======환영합니다.=======");
			System.out.println("*****메인 메뉴*****");
			
			
			System.out.println("1. 로그인 :");
			System.out.println("2. 회원가입 :");
			System.out.println("9. 종료 ");
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: mm.login();
			break;
			case 2: mm.enroll();
			break;
			case 9 :
				System.out.println("프로그램 종료");
				default :
					System.out.println("잘못입력하셨습니다 다시 입력해주세요.");
			}
		}
		
		
		
	}

	public static Scanner sc() {
		return null;
	}
	
	
	
}
