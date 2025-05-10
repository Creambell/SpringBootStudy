package four.chap03.branch;

import java.util.Scanner;

public class Break {
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("문자 열 입력 : ");
		String str = sc.nextLine();
		
		if(str.equals("end")) {
			break;
		}
		
		int length = str.length();
		System.out.println(str + "의 길이 : "+ length);
		}
	}
}
