package eight.example.test.model.vo;

public class Dog extends Animal{
	private double height;
	private String hair;
	
	
	public Dog() {}
	public Dog(String name,int age,double weight,double height,String hair) {
		super(name, age, weight);
		this.height = height;
		this.hair = hair;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
//	@Override
//	public String infrom() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() +" "+ height + " "+hair;
//	}
	@Override
	public String toString() { // Animal 상속받고 재작성까지함
		return super.getName() + " " + super.getAge() + " " + super.getWeight() +" "+ height + " "+hair;
	}
	
	
}
