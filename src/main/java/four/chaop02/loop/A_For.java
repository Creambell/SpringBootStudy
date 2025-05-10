package four.chaop02.loop;

import java.util.Scanner;

public class A_For {
	public void method1() {
		for(int i = 1;i<=5;i++){
			System.out.println(i);
		}
		
	}

	public void method2() {
		for(int i = 0; i<4;i++) {
			System.out.println("나는 조호선");
		}
	}

	public void method3() {
		for(int i = 5; i>= 1;i--) {
			System.out.println(i);
		}
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
		
		for(int i = 2;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		
		
	}

	public void method7() {
		
		for(int i = 1; i<24;i++) {		//i<=23
			for(int j = 1;j<60;j++) {	//j<=59
				System.out.printf("%d시 %d분\n",i,j);
			}
		}
		
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);
			System.out.println("줄 수 :");
			int row = sc.nextInt();
			for(int r = 1; r<= row; r++) {
				for(int c = 1; c <= 5; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 :");
		int jul = sc.nextInt();
		System.out.print("칸 수 :");
		int cao = sc.nextInt();
		
		int j;
		int c;
		
		for(j = 1;j <=jul;j++) {
			for( c = 1;c <=cao;c++) {
				if( j == c) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}


