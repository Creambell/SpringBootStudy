package ten.chap01_poly.test.model.vo;

public class Child6 extends Parent{
	private int n;
	
	public Child6() {}
	public Child6(int x, int y, int n) {
		super(x,y);
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("나 두번째 자식이야");
	}
}
