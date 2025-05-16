package eight.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	private String str;
	
	public Child3() {
		Parent p = new Parent();
		p.ch = 'a';	//public
//		p.bool = false;//protected
//		p.dNum = 10.2;//default
		//p.num = 10; private
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	
}
