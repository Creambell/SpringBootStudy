package eight.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent();
		p.ch = 'a';	//public
		p.bool = false;//protected
		p.dNum = 10.2;//default
		//p.num = 10; private
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	
}
