package com.kh.overall.member.view;

import java.util.Scanner;

import com.kh.overall.member.controller.MemberController;
import com.kh.overall.member.model.vo.Member;
import com.kh.overall.view.FarmMenu;
import com.kh.overall.view.Menu;

public class MemberMenu {

	private Scanner sc = Menu.sc;
	private MemberController mc = new MemberController();
	private FarmMenu fm = new FarmMenu();
	
	public Member loginMemeber() {
		return null;
		}
	
	public Member login() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			Member name = mc.login(id, password);
			if(name != null) {
				System.out.println(name + "님, 환영합니다!");
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
		return null;
		
	}
	public void enroll() {}
	
	public void customerMenu() {}
	
	public void adminMenu() {}
	
	public void checkMyInfo() {}
	
	public void updateMyInfo() {}
	
	public void deleteMyInfo() {}
	
	public void goVegetable() {}
	
	public void logout() {}
	
	
	
	
	
	
	
	
}
