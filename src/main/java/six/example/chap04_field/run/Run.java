package six.example.chap04_field.run;

import java.util.Arrays;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {

	public static void main(String[] args) {

		KindsOfVariable2 kov = new KindsOfVariable2();
//		System.out.println(kov.staticNum);
		//객체를 만들어주지않아도 static를 사용해 이미 메모리에 올려서 사용가능
		System.out.println(KindsOfVariable2.staticNum);
		
		kov.test();
		kov.test();
		kov.test();
		
		KindsOfVariable2 kov2 = new KindsOfVariable2();
		kov2.test();
		
		
//		Math.random();
//		Integer.parseInt("");
//		Arrays.toString(null);
//		System.arraycopy(args, 0, args, 0, 0);
//		Arrays.copyOf(null, 0);
		//System.out <= 아웃도 스태틱 변수
		
		//클래스 . 값은 스태틱형식
		
	}

}
