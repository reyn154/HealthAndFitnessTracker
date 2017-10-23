package org.reyn.healthfitness.fitnessCalculations;

public class Fitness {
	
	private double weight;
	private double height;
	private String gender;
	private int age;
	private double goalWeight;
	private int daysToLoseWeight;
	private double bmi;
	
	public Fitness() {

	}
	
	public Fitness(double weight, double height, String gender, int age, double goalWeight, int daysToLoseWeight) {
		super();
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.goalWeight = goalWeight;
		this.daysToLoseWeight = daysToLoseWeight;
		this.bmi = weight / (height * height);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGoalWeight() {
		return goalWeight;
	}
	public void setGoalWeight(double goalWeight) {
		this.goalWeight = goalWeight;
	}
	public int getDaysToLoseWeight() {
		return daysToLoseWeight;
	}
	public void setDaysToLoseWeight(int daysToLoseWeight) {
		this.daysToLoseWeight = daysToLoseWeight;
	}
	
	public double getBmi() {
		return bmi;
	}

}
