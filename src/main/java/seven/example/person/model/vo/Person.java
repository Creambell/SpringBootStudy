package seven.example.person.model.vo;

public class Person {

	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person(){}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,char gender,double height,double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String personInfo() {
		return name + "님 "+ age+"살의 " + gender+"자이시고 " + height+"이며 " + weight
				+"이시군요";
	}
	
}
