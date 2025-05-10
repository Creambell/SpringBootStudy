package four.chaop01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력 :");
		int num = sc.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 값 : ");
		int ab = sc.nextInt();
		if(ab > 0) {
			System.out.print("양수");
		}else if(ab < 0){
			System.out.print("음수");
		}else if(ab == 0){
			System.out.print("0입니다");
		}
		
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력 - 포함 :");
		String ress = sc.nextLine();
		char ch = ress.charAt(8);
		
		String result;
		if(ch == '1' || ch == '3') {
			result ="남성";
		}else if(ch == '2' || ch == '4') {
			result ="여성";
		}else {
			result ="알 수 없 음";
		}
		System.out.println(result);
		
//		if(ch == '1' || ch == '3') {
//			System.out.print("남성");
//		}else if(ch == '2' || ch == '4') {
//			System.out.print("여성");
//		}else {
//			System.out.print("알 수 없 음");
//		}
		
		
		
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별 (M/F)입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'M' || ch == 'm') {
			System.out.print("남학생");
		}else if(ch == 'F' || ch == 'f') {
			System.out.print("여학생");
		}else {
			System.out.print("오타입니다 M/F 중 입력해주세요");
		}
		
		
		
}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은 ? :");
		String name = sc.nextLine();
		// equals() : boolean
		boolean same = name.equals("조호선");
		if(same) {
			System.out.print("내 이름이 맞습니다");
		}else {
			System.out.print("제 이름이 아니예요");
		}
		
		
		
	}
}
