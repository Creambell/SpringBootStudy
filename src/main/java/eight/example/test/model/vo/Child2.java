package eight.example.test.model.vo;

public class Child2 extends Parent{ // 상속
	private String str;
	
	public Child2() {
		System.out.println("Child2 : "+this);
		super.ch = 'a'; //public
		super.bool = false; // protected
		super.dNum = 10.0; //default
//		super.num = 0; private
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
