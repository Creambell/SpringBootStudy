package com.kh.example.set.model.vo;

import java.util.Objects;

public class Dog implements Comparable<Dog>{
	
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name,double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name+"님 " + weight + "kg";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	@Override
	public int compareTo(Dog o) {
		// 이름 오름차순
		String standard = name;
		String object = o.name;
		
		
		return standard.compareTo(object);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
