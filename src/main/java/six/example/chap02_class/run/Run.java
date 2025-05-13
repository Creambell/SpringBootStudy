package six.example.chap02_class.run;

import com.kh.example.chap02_class.controller.PublicClass;

public class Run {
	public static void main(String[] args) {
		PublicClass pc = new PublicClass();
		pc.test();
		
//		Defaultclass bc = new Defaultclass();
		//같은 패키지에서만 접근이 가능한 디폴트를 사용한 클래스이기때문에
		// 외부패키지에서 접근 불가능
		
	}
}
