package five.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		int[] originArr = {1,2,3,4,5,};
		System.out.println(originArr);
		System.out.println(Arrays.toString(originArr));
		int[] copyArr = originArr;
		System.out.println(copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		originArr[0] = 99;
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		originArr[4] = -99;
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
	}

	
	public void method2() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		System.out.println();
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		originArr[0] = 99;
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println();
		
		copyArr[4] = -99;
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
	}

	public void method3() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		//Syste.arraycopy()를 이용한 깊은 복사
//		  System.arraycopy(src, srcPos, dest, destPos, length);
		//					외부터로부터 값을 전달 받는 부분 : 매개변수(인자)
		//데이터 정의에서 외부값을 전달하는건 인자 받는것은 매개변수
		// src 		: 원본 배열
		// srcpos 	: 원본 배열에서 복사를 시작할 위치
		// dest 	: 복사 배열
		// destPos 	: 복사 배열에서 붙여넣기를 시작할 위치
		// length 	:	  복사 길이 !
		
		//원본 배열의 0 index부터 원본 배열의 길이만큼 복사 후,
		//복사 배열 3 index서부터 붙여넣기
		System.out.println();
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		
	}

	public void method4() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println();
		
		// Arrasy.copof()를 이용한 깊은 복사
		// 주소값 갈아치움
		// 컨트롤 클릭으로 알수있듯이 깊은 복사안에 얕은 복사가 두번 일어났다.
		//originArr->int[] original로 copyARr=~~ 로 두번
		// 나중에 한번 더 확인
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("originArr : " + originArr);
		System.out.println(Arrays.toString(originArr));
		System.out.println("copyArr : " + copyArr);
		System.out.println(Arrays.toString(copyArr));
		
		
	}
	
	
	
	
	
}
