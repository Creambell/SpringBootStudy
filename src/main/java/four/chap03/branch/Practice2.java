package four.chap03.branch;

import java.util.Scanner;

public class Practice2 {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int hap = sc.nextInt();

		while(hap<0) {
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			hap = sc.nextInt();
			
		}
		for(int i = 1; i < hap; i++) {
			System.out.print(i);	
		}
	}
}
