package ten.chap01_poly.test.model.vo;

public class Child1 extends Parent{
	private int z;
	
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("나의 첫번째 자식이야");
	}
	@Override
	public void print() {
		System.out.println("나 진짜 첫 번째 자식이라니까?");
	}
}
