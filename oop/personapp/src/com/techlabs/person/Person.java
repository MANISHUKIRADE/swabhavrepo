package com.techlabs.person;

public class Person {
	private final String name;
	private final  Gender sex;
	private final int age;
	private double height;
	private double weight;
	double bmi;
	BmiCatergory category;

	public Person(String name, Gender sex, int age, double height, double weight) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		calculateBmi();
	}

	
	public String getName() {
		return name;
	}

	public  Gender getGender() {
		return sex;
	}

	public int getAge() {
		return age;

	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		bmi = weight / (height * height);
		return bmi;
	}

	public BmiCatergory getBmiCategory() {
		if ((16 <= bmi)&&( bmi <= 18.5)){ 

			return BmiCatergory.UNDER_WEIGHT;
			

		} else if ((18.5 <= bmi )&&(bmi<=25)) {
			return BmiCatergory.NORMAL;
		} else if (( 25<= bmi)&&(bmi <= 30)) {
			return BmiCatergory.OVER_WEIGHT;
		}else if(bmi<16) {
			return BmiCatergory.SEVERELY_UNDERWEIGHT;
		}
		else {
			return BmiCatergory.OBESE_CLASS;
		}
	}
	

	
	public void doWorkOut() {
		changeWeight(10);
		calculateBmi();
	}
	
	public void eat() {
		changeWeight(5);
		changeHeight(2.5);
		calculateBmi();
	}
	
public void calculateBmi(){
	bmi = weight / (height * height);
}
public void changeHeight(double value) {
	height = height+((value*height)/100);
}
public void changeWeight(double value) {
	weight = weight+((value*weight)/100);
}
}
