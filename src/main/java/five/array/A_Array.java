package five.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	public void method1() {
		//int 타입의 변수 9개 생성(num1~num9)
		//각 변수에 10~90까지의 숫자 대입 후 int sum 변수에 num1~num9까지합대입
		
//		int num[] = {10,20,30,40,50,60,70,80,90};
//		int sum = num[9]; !
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		System.out.println(sum);
		
		int[] arr = new int[9];
		System.out.println(Arrays.toString(arr));
		
		//인덱스를 이용한 배열 초기화
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
		System.out.println(Arrays.toString(arr));
		
		//for문을 통한 배열 초기화 : 규칙이 있을 때만 가능
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10*(i+1);
		}
		System.out.println(Arrays.toString(arr));
		
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 = sum2+arr[i];
		}
		//선언과 동시에 초기화
		int[] arr2 = {10,20,30,40,50,60,70,80,90};
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void methode2() {
		int[] iArr = new int[5];
		System.out.println(iArr);
		int[] iArr2 = new int[5];
		System.out.println(iArr2);
		char[] chArr = new char[10];
		System.out.println("chArr : " +chArr);
		
		for(int i = 0; i < iArr.length;i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < chArr.length;i++) {
			System.out.print(chArr[i] + ",");;
		}
		System.out.println();
		
		System.out.println("새로 할당할 배열의 길이를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double[] dArr = new double[size];
		System.out.println(dArr);
		for(int i= 0; i < dArr.length; i++) {
			System.out.print(dArr[i] + " ");
		}
		System.out.println();
		
		dArr = new double[26];
		for(int i = 0 ; i <dArr.length; i++) {
			System.out.print(dArr[i] + " ");;
		}
		System.out.println();
		System.out.println(dArr);
		
		dArr = null;
		System.out.println(dArr.length);
	}



}
