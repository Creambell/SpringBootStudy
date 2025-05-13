package six.example.practice2.model.vo;

public class Circle {

	public static final double PI = 3.14;
	private static int radius = 1;
	
	public void incrementRadius() {
		
	}
	public void getAreaOfCircle() {
		System.out.println(PI*radius*radius);
	}
	public void getSizeOfCircle() {
		System.out.println(2*PI*radius);
	}
	
	
	
}
