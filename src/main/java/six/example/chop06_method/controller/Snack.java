package six.example.chop06_method.controller;

public class Snack {

	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
	public Snack(String kind,String name,String flavor,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String information() {
		return information();
	}
	
	
	public String setKind() {
		return kind;
	}
	public void getKind(String kind) {
		this.kind = kind;
	}
	public String setName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	public String setFlavor() {
		return flavor;
	}
	public void getFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int setNumOf() {
		return numOf;
	}
	public void getNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int setPrice() {
		return price;
	}
	public void getPrice(int price) {
		this.price = price;
	}
	
}
