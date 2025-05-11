package five.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_Array {
	public void method1() {
		int[] a = new int[10];
		
		for(int i = 0; i< a.length;i++) {
			a[i] = i+1;
			//a의 방이 10개 = 0번방+1자체가 출력!
			//a[0] = 0+1 == 1 을 10번 반복
			//a[1] = 1+1 == 2 ... 해서 1 2 3 4 5
			System.out.print(a[i] + " ");
		}
	}
	
	public void methdo2() {
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i]= arr.length-i;
			// arr[0] = arr[10] - 0
			// arr[1] = arr[10] - 1 잘 이해가 안됌
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num1 = sc.nextInt();
		
		int[] num2 = new int[num1];
		for(int i = 0; i < num2.length; i++) {
			num2[i] = i+1;
			System.out.print(num2[i] + " ");
		}
		
		
	}
	
	public void method4() {
		
		String[] fruit = new String[5];
		
		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";
		
		System.out.print(fruit[1]);
		
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine(); //문자열 받아옴
		System.out.print("문자 : "); //문자 중 1개만 선택가능하게 받아옴
		char ch = sc.nextLine().charAt(0);
		
		//입력받은 str의 크기를 chArr이라는 배열에 새로 담았음
		// char배열에 새로담는건 문자열 밖에 안됌 int = x
		char[] chArr = new char[str.length()]; 
		int count = 0; // count 선언
		
		//입력받고 1개짜리를 소환
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		// i 가 입력받은수크기에게서 0부터 커질때 chArr[0] = 
		// i(0)이 내가 입력한 숫자보다 작을때 1씩 증가하고
		for(int i = 0; i < str.length(); i++) {
		//apple을 치면 chArr[0] = str.charAt(0);
			chArr[i] = str.charAt(i);
			//str.charAt()은 문자 하나를 소환하는건데
			//i를 넣어줌으로써 i는 0부터 str.length의 길이까지
			//str.charAt(i)는 0부터 s.l까지 길이의 문자를 한개씩 소환함
			//이를 chArr[i]에 넣어서 확인
			
			
			// 문자입력과 입력배열방이 같으면 count를 1씩 올려줌
			//ch 는 charAt문이라 한개씩불러와서 0~4까지는 하나씩인가
			//그럼 a == chArr[0] /0은 apple의 a
			//a 성립하고 카운트 +1 (0 + " ") <- 0번째로 표시되는것
			//그럼 a ==  chArr[p] 하면 노성립
			// a == chArr[ 0.a 1.p 2.p 3.l 4.e] 가 됌
			if(ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		//ch 는 내가 문자에 입력한 단어 그대로 나타내므로 
		//a + 개수 + a와 일치하는 chArr[i]의 값
		System.out.println(ch + " 개수 : " + count);
	}
	
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		String aa[] = new String[7];
		
		aa[0] = "일요일";
		aa[1] = "월요일";
		aa[2] = "화요일";
		aa[3] = "수요일";
		aa[4] = "목요일";
		aa[5] = "금요일";
		aa[6] = "토요일";
		
		switch(num1) {
		case 0 :
			System.out.print(aa[0]);
			break;
		case 1 :
			System.out.print(aa[1]);
			break;
		case 2 :
			System.out.print(aa[2]);
			break;
		case 3 :
			System.out.print(aa[3]);
			break;
		case 4 :
			System.out.print(aa[4]);
			break;
		case 5 :
			System.out.print(aa[5]);
			break;
		case 6 :
			System.out.print(aa[6]);
			break;
		default : 
			System.out.print("0~6 사이를 입력해주세요");
			break;
		}
	}

	public void method7() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("총 합 : "+sum);
		
		
		
	
	
	}
	
	public void method8() {
		String[] arr = {"후라이드","양념","파닭","매콤","치즈","간장"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(chicken)) {
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println(chicken + " 치킨 배달 가능");
		}else {
			System.out.println(chicken + " 치킨은 없는 메뉴입니다.");
		}
		
	}
	
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		char[] chArr = new char[id.length()];
		for(int i = 0; i < id.length();i++) {
			chArr[i] = id.charAt(i);
		}
		char[] copyArr = new char[chArr.length];
		System.arraycopy(chArr,0,copyArr,0,8);
		for(int i = 8; i < copyArr.length;i++) {
			copyArr[i] = '*';
		}
		
		for(int i = 0; i < copyArr.length;i++) {
			if(i >= 8) {
				copyArr[i] = '*';
			}else {
				copyArr[i] = chArr[i];
			}
			System.out.print(copyArr[i]);
		}
		
		
	}
	
	public void method10() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		
		
	}

	public void method11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		String[] strArr = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}
		
		String user = null;
		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			user = sc.nextLine();
			
			if(user.toUpperCase().equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine();
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				
				strArr = newArr;
			}
			
		} while(!user.toUpperCase().equals("N"));
		
		System.out.println(Arrays.toString(strArr));
	}

	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 !=0) {
				arr = new int[num];
				int div = num / 2;
				for(int i = 0; i <= div; i++) {
					arr[i] = (i+1);
				}
				for(int i = div+1; i < arr.length; i++) {
					arr[i] = num-1;
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	public void method12_1() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 != 0) {
				arr = new int[num];
				int div = num / 2;
				for(int i = 0; i <= div; i++) {
					arr[i] = (i+1);
				}
				for(int i = div+1; i < arr.length; i++) {
					arr[i] = num-i;
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	}

