package ten.chap02_abstaract.family.model.vo;

public class Baby extends Family implements Basic, Cloneable{

	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setWeitght(super.getWeight()+3);
		super.setHealth(super.getHealth()+1);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth()+ 3);
	}

}
