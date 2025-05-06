package two.variable;

import java.util.Scanner;

public class D_KeyboardInput {
    //	public void inputScanner1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 가르켜주세요 : ");
//		String name = sc.nextLine();
//
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//
//		System.out.print("키를 입력하세요 : ");
//		double height = sc.nextDouble();
//		//float height = sc.Float();
//
//		System.out.printf("이름은 %s 나이는 %d 키는 %f인가요?\n",name,age,height);
//
//	}

    public void inputScanner2() {
        // 이름 나이 주소 성별 사용자에게 입력받고 출력
        Scanner sca = new Scanner(System.in);
        System.out.print("이름 입력 :");
        String name = sca.nextLine();

        System.out.print("나이 입력 :");
        String strage = sca.nextLine();
        int age = Integer.parseInt(strage); //문자열로 데이터를 숫자열로 바꿈 : 파싱
        //사실상 숫자만 적을수있기때문에 문자열이 들어가면 에러가 발생
        System.out.print("주소 입력 :");
        String address = sca.nextLine();

        System.out.print("성별을 입력하세요 (M/F) : ");
        String sexual = sca.nextLine();
        char gender = sexual.charAt(0);
        //candy = 01234 번 숫자

        System.out.printf("이름은 %s(%d)세의 주소는 %s 성별은 %c입니다",name,age,address,gender);
        //주소를 next로 변경 buffer에 남아있는 newxLint으로 풀기

//		//해결 1 주소를 next()하기
//		System.out.print("주소를 입력하세요");
//		String address = sc.next():
//
//		//해결 2. buffer에 남아있는 줄바꿈을 nextLine()로 없애주기
//			sc.nextLine(): // 남아있는줄바꿈을 없애는 용도
//
//		//해결 3. System.out.print(주소)
        // String address = sc.nextLint();

        //스캐너에서 nextchar는 미제공해서 우회해 값을 가져와야함
        //String 에서 char만들기 : charAt()


    }
}
