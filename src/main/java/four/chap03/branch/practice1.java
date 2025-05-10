package four.chap03.branch;

import java.util.Scanner;

public class practice1 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int hap = sc.nextInt();
		
		if(hap<0 || hap == 0) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}
		for(int i = 1; i < hap; i++) {
			System.out.print(i);	
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		while(a<1) {
			System.out.print("1이상의 숫자를 입력하세요 :");
			a = sc.nextInt();
		}
		// i++ 증감식은 올려주지만 i-- 증감식은 밑에와같이
		// 0이 될때까지 감소시킨다.
		for(int i = a; i >= 0; i--) {
			System.out.print(i + " ");
		}
		
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 :  ");
		int a = sc.nextInt();
		
		int result = 0;
		int i =0;
		int sum = 0;
		for(i =0;i<=a;i++) {
			result = i;
			sum += i;
			System.out.print(result +"+");
			
		}
		System.out.print( a +"=" + sum);
		
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		int min = first;
		int max = second;
		if(min <= 0 || max<= 0) {
			System.out.print("1이상의 숫자를 입력해주세요 ");
		}else if(min>max) {
			for(int i = min; min>=max;max++) {
				System.out.print(max +" ");
			}
		}else if(min<max) {
			for(int j = max; min<=max;min++) {
				System.out.print(min+" ");
			}
		}
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		//while에 true넣어서 완료되지않으면 무한반복으로 만듬
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int first = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int second = sc.nextInt();
			sc.nextLine();
			
			int min = first;
			int max = second;
			
			if(min < 1 || max < 1) {
				System.out.print("1이상의 숫자를 입력해주세요 ");
			}else if(min>max) {
				for(int i = min; min>=max;max++) {
					System.out.print(max +" ");
				}
			}else if(min<max) {
				for(int j = max; min<=max;min++) {
					System.out.print(min+" ");
				}
			}
			//break;// 무한반복이기에 break를 안넣으면 조건이 맞아도 반복
		}
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int one = sc.nextInt();
		
		for(int i = 1; i<=9;i++) {
			
			System.out.println(one + "*" + i + "= "+(one*i));
		}
		
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int one = sc.nextInt();
		
		if(one >9) {
			System.out.print("9 이하의 숫자만 입력해주세요");
		}
			while(one<10) {
				if(one <10) {
					System.out.println(one+"단");
					for(int i = 1;i<10;i++) {
						System.out.printf("%d * %d = %d\n",one,i,(one*i));
					}
				}
				one++;
			}
		}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("숫자 : ");
		int one = sc.nextInt();
		
			if(one >9) {
				System.out.print("9 이하의 숫자만 입력해주세요");
			}else {
				while(one<10) {
					if(one <10) {
						System.out.println(one+"단===");
						for(int i = 1;i<10;i++) {
							System.out.printf("%d * %d = %d\n",one,i,(one*i));
						}
					}	
				one++;
				}
			}
//		break;
		}
	}
		
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int space = sc.nextInt();

			for(int i = 0;i<10;i++) {
				System.out.println(start);
				start += space;
			}
		}
		
	

	public void method11() {
		Scanner sc = new Scanner(System.in);
		//다시 풀어야함
		while(true) {
			System.out.print(" +, -, *, /, % : ");
			char yan = sc.nextLine().charAt(0);
			System.out.print("정수1 : ");
			int a = sc.nextInt();
			System.out.print("정수2 : ");
			int b = sc.nextInt();
			int result = 0;
			
			if(b == 0) {//0으로 못 나눠서 if문을 미리 위로제작
				System.out.println("0으로 나눌 수 없습니다");
				break;
			}else if(yan == '+') {
				result = a+b;
			}else if(yan == '-') {
				result = a-b;
			}else if(yan == '*') {
				result = a*b;
			}else if(yan == '/') {
				result = a/b;
			}else if(yan == '%') {
				result = a%b;
			}else {
				
				System.out.print("없는 연산자입니다. 다시 입력해주세요. ");
				break;
			}
		
		System.out.printf("%d %s %d = %d",a,yan,b,result);
	}
}
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for(int i =1;i<=num1;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

	public void method13() {// 다시 풀어봐야함
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for(int i =0;i<=num1;i++) {
			for(int j =num1;j>i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
	
	public void method11_1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자");
			String op = sc.next();
//			int num3 = Integer.parseInt(op); 스트링을 인트타입변경
			
			if(op.equals("exit")) {
				System.out.println("프로그램 종료");
	//			return;
				break;
			}
			
			System.out.print("정수 1 :");
			int num1 = sc.nextInt();
			System.out.print("정수 2 :");
			int num2 = sc.nextInt();
			
			switch(op) {
			case "+" :
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1+num2));
				break;
			case "-" :
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1-num2));
				break;
			case "*" :
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1*num2));
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다");
				}else {
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1/num2));
				continue;// whil(true문때문에 break;로 끝내도 된다.
			}
				break;
			case "%" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다");
				}else {
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1%num2));
			}
				break;
			default: System.out.println("없는 연산자");
			
		}
		}
		}
}


