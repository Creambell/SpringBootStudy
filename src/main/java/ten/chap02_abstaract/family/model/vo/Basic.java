package ten.chap02_abstaract.family.model.vo;

import java.io.Serializable;

public interface Basic  extends Cloneable , Serializable{
	// 							마커 인터페이스
	
	//인터페이스 안에는 상수형필드만 가능
//	public int a;
	
	
	 /* public static final */ double PI = 3.14;
	 
	 public abstract void eat();
	 void sleep();
	
}
