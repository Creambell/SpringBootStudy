package four.chaop02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
			}
		
		}
	
	public void method2() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
	}

	public void method3() {
		int i = 1;
		do{
			System.out.println(i);
			i +=2;
		}while(i <=10);
	}

	public void method4() {
		for(int i = 8; i >= 3; i--) {
			System.out.println(i);}
			for(int i = 0; i <6 ; i++) {
				System.out.print(8-i);
			}
		}
	
	public void method5() {
		for(int i = 1; i <=10; i+=2) {
			if(i % 2 == 1 ) { //!=0
				System.out.println(i);
			}
			
		}
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요");
		System.out.println("단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요");
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
//		for(int i = start;i<=end;i++) {
//			System.out.print(i);
//		}
		int min = 0;
		int max = 0;
		
		if(start > end) {
			min = end;
			max = start;
		}else {
			min = start;
			max = end;
		}
		
		for (int i = min; i <=max; i++) {
			System.out.println(i);
		}
		
	}

	public void method4_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 양수 하나 입력 :");
		int dan = sc.nextInt();
		
		for(int i = 1; i<=9;i++) {
			if(dan >=1 && dan<=9) {
			System.out.printf("%d X %d = %d\n",dan,i,dan * i);
		}else {
			System.out.print("1~9사이에 숫자를 입력하셔야합니다.");
			
		}
	}
}

	public void method5_1() {
		Scanner sc = new Scanner(System.in);
		
		
//		double random = Math.random();
//		System.out.print(random);
		/*
		 * 0<= math.random() <1 : 0~0.9999...
		 * 0<= math.random()*10 < 10 :9.9999...
		 * 1<= math.random()*10 + 1 < 11 :1~10.999999....
		 * 1<= (int)(math.random()*10+1)<11 : 1~10
		 */
		int random = (int)(Math.random()*10+1);
		System.out.println(random);
		
		int sum = 0;
		for(int i =1;i<=random;i++) {
			sum += i;
			
			}
		System.out.printf("1부터 %d 까지의 정수 합계:%d\n",random,sum);
	}

	public void method5_2() {
		Scanner sc = new Scanner(System.in);
		
		//1부터 50.9999...까지 범위
		int random = (int)(Math.random()*50+1);
		System.out.print("랜덤 수 는 :"+random);
		if(random % 2 ==0) {
			System.out.print("짝수");
		}else {
			System.out.print("홀수");
		}
	}

	public void method6_1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2단부터 9단까지 출력");
		int i = 1;
		int j = 1;
		while(i <= 9) {
			while(j <= 9) {
				System.out.print(i+"x"+j+"="+i*j);
				j++;
			}
			i++;
		}
//		for(int i = 2;i<=9;i++) {
//			for(int j = 1;j<=9;j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//		}
		
		
	}

	public void method7() {
		int i = 0;
		while(i < 24) {
			int j = 0;
			while(j < 60) {
			System.out.printf("%d시 %d분\n",i,j);
			j++;
			}
		i++;
		}

//		for(int i = 1; i<24;i++) {		//i<=23
//			for(int j = 1;j<60;j++) {	//j<=59
//				System.out.printf("%d시 %d분\n",i,j);
//			}
//		}
		
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);
			System.out.println("줄 수 :");
			int row = sc.nextInt();
			int r = 1;
			while(r <= row) {
				int c = 1;
				while(c <= 5) {
					System.out.print("*");
					c++;
				}
				r++;
				System.out.println();
			}
				
			
			
//			for(int r = 1; r<= row; r++) {
//				for(int c = 1; c <= 5; c++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 :");
		int jul = sc.nextInt();
		System.out.print("칸 수 :");
		int cao = sc.nextInt();
		
		int j = 1;
		do {
			int c= 1;
			do {
				if(j == c) {
					System.out.print(j);
				}else {
					System.out.print("*");
			}
				c++;
			}	while(c <= cao);
			System.out.println();
			j++;
		}while(j <= jul);
	}
	
		public int method10() {
			Scanner sc = new Scanner(System.in);
			int menuNum = 0;
			while(menuNum != 9) {
				System.out.println("1. 1~5까지 출력");
				System.out.println("2. 5~1까지 출력");
				System.out.println("3. 1~10까지 출력");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				//메뉴 선택은 보통 스위치로 한다.
				switch(menuNum){
				case 1: method1(); break;
				case 2: method2(); break;
				case 3 : method3(); break;
				case 9 : System.out.println("종료"); break;
				default : System.out.println("잘못 입력하셨습니다.");
				}
			}return 0;
//			
//			
//			if(menuNum == 1) {
//				method1();
//			}else if(menuNum == 2) {
//				method2();
//			}else if(menuNum ==3) {
//				method5();
//			}else if(menuNum == 9) {
//				System.out.print("종료");
//			}else {
//				System.out.print("");
//			}
//			
//			
//		}
		}
		public void method11() {
			Scanner sc = new Scanner(System.in);
			int menuNum = 0;
			while(true) {
				System.out.println("1. 1~5까지 출력");
				System.out.println("2. 5~1까지 출력");
				System.out.println("3. 1~10까지 출력");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				//메뉴 선택은 보통 스위치로 한다.
				switch(menuNum){
				case 1: method1(); break;
				case 2: method2(); break;
				case 3 : method3(); break;
				case 9 : System.out.println("종료"); return;
				default : System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
			
			public void method12() {
				Scanner sc= new Scanner(System.in);
				String str = "";
				
				while(!str.equals("exit")){
						System.out.print("exit / 종료");
						str = sc.nextLine();
						System.out.println("str : " +str);
					}
			}
			
		public void method12_1(){
			Scanner sc= new Scanner(System.in);
			String str = null;
			do {
				System.out.print("문자열 입력 :");
				str = sc.nextLine();
				System.out.println("str : " +str);
			} while(!str.equals("exit"));
					
			
			
			
		}

}
