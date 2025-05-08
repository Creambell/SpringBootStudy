package three.src.com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println
		("1부터 100사이인지 확인 : " + (1<=num && num <=100));
		
	}
	
	public void method2() {
		//입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 :");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println
		("영어가 대문자입니까? : " + (ch>=65 && ch<=90));
		//ch <='A' && ch<= 'Z' 문자열은 x 문자만 가능
		System.out.println("계속하시겠습니까? 계속하시려면 Y or y 입력해주세요 :");
		char ch2 = sc.nextLine().charAt(0);
//		메소드 체이닝
		System.out.println("계속 하겠다고 했습니까? : " + (ch2=='Y' || ch2=='y'));
		
		
		
		
		
	}
}
