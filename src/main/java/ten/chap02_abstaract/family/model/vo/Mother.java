package ten.chap02_abstaract.family.model.vo;

public class Mother extends Family implements Basic{ //추상 메소드가 오버라이딩 강제화
	// 인터페이스는 implements를 사용해서 상속
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name,double weight,int health,String babyBirth) {
		super(name,weight,health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = this.babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + babyBirth;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setWeitght(super.getWeight()+10);
		super.setHealth(super.getHealth()-5);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth()+10);
	}
	
	
}
