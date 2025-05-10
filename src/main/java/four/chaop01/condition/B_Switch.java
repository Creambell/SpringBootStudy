package four.chaop01.condition;

import java.util.Scanner;

public class B_Switch {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		// 정수 2개와 연산기호 1개를 받아 계산 수행 후 결과 출력
		System.out.print("첫 번째 값 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 값 : ");
		int second = sc.nextInt();
		System.out.print("연산자(+-*/) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		if(op == '+') {
			result = first + second;
		}else if(op == '-') {
			result = first - second;
		}else if(op == '*') {
			result = first * second;
		}else if(op == '/') {
			result = first / second;
		}else {System.out.print(" ");}
		System.out.print(result);
//		switch(op) {
//		case '+' :
//			result = first + second;
//			break;
//		case '-' :
//			result = first - second;
//			break;
//		case '*' :
//			result = first * second;
//			break;
//		case '/' :
//			result = first / second;
		}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("~*~*~*~*~*~KH 과일가게");
		System.out.println("사과,바나나,복숭아,키위 있습니다");
		System.out.println("어떤 과일의 가격이 궁금하세요?");
		String fruit = sc.nextLine();
		
		int price = 0;
		boolean flag = true;
		switch(fruit){
		case "사과" : 
			price = 1000;
			break;
		case "바나나" : 
			price = 3000;
			break;
		case "복숭아" : 
			price = 2000;
			break;
		case "키위" : 
			price = 5000;
			break;
		default :
				System.out.print("그 과일은 없습니다 ");
				flag = false;
		}
		if(flag)
		System.out.print(fruit + "의 가격은" + price + "원입니다.");
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		//입력하신 달의 마지막 날은 ??일입니다.
		
		int result = 0;
		switch(month) {
		case 1 : case 3 : case 7 : case 8 :
			result = 28;
			break;
		case 2 : 
			result = 29;
			break;
		case 4 : case 10 : case 11 : case 12 :
			result = 30;
			break;
			default :
				System.out.println(month+"달은 존재하지않습니다.");
		}
		if(month >=1 && month <=12)
		System.out.println("입력하신 "+month+ " 달의 마지막 날은"+result);
	}		

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 계산기");
		System.out.println("2. 과일가게");
		System.out.println("3. 마지막 날짜");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("'계산기'입니다.");
			method1();
			break;
		case 2 :
			System.out.println("'과일가게'입니다.");
			method2();
			break;
		case 3 :
			System.out.println("'마지막 날짜'입니다.");
			method4();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}



