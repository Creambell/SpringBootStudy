package three.src.com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	public void method() {
		Scanner sc = new Scanner(System.in);
		//입력한 정수의 홀짝 판별후 맞게 출력
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		int avg = num%2;
		String result = avg >= 1 ? "홀수" : "짝수";
		System.out.print(result);
		//String result = num % 2 == 0 ? "짝수 : "홀수";
		//sys~(result);
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		String str = num > 0 ? "양수다" : (num == 0 ? "0이다" : "양수가 아니다");
		System.out.println(str);
		
		
		
	}
}
