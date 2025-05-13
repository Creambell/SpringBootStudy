package six.example.practice2.run;

import com.kh.example.practice2.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		
//		Product pr = new Product();
//		pr.information();
		
		Circle ci = new Circle();
		ci.incrementRadius();
		
		System.out.println("원의 둘레 : ");
		ci.getSizeOfCircle();
		System.out.println("원의 넓이 : ");
		ci.getAreaOfCircle();
		
		System.out.println("반지름 1 증가");
		ci.incrementRadius();
		
		System.out.println("원의 둘레 : ");
		ci.getSizeOfCircle();
		System.out.println("원의 넓이 : ");
		ci.getAreaOfCircle();
	}
}
