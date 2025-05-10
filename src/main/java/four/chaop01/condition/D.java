package four.chaop01.condition;

import java.util.Scanner;

public class D {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력 :");
		System.out.println("2. 수정 :");
		System.out.println("3. 조회 :");
		System.out.println("4. 삭제 :");
		System.out.println("7. 종료 :");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		String menu = sc.nextLine();
		
		String result;
		if(menu.equals("1")) {
			result = "입력 메뉴입니다.";
		}else if(menu.equals("2")) {
			result = "수정 메뉴입니다.";
		}else if(menu.equals("3")) {
			result = "조회 메뉴입니다.";
		}else if(menu.equals("4")) {
			result = "삭제 메뉴입니다.";
		}else if(menu.equals("7")) {
			result = "종료 메뉴입니다.";
		}else {
			result = " 없는 메뉴 입니다.";
		}
		
		System.out.print(result);
		
	}
}
