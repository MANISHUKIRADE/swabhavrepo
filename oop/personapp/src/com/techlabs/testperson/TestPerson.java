package com.techlabs.testperson;

import com.techlabs.person.Person;
import com.techlabs.person.Gender;

public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person("manish",Gender.MALE,21,1.6764,54);
		System.out.println(" name   "+person1.getName());
		System.out.println(" gender    "+person1.getGender());
		System.out.println(" age   "+person1.getAge());
		System.out.println(" height  "+person1.getHeight());
		System.out.println(" weight   "+person1.getWeight());
		System.out.println("bmi      "+person1.getBmi());
		System.out.println("bmi category     "+person1.getBmiCategory());
		person1.doWorkOut();
		
		System.out.println("weight after workout    "+person1.getWeight());
		System.out.println("bmi    "+person1.getBmi());
		System.out.println("bmi category   "+person1.getBmiCategory());
		
		person1.eat();
		
		System.out.println("weight after eat   "+person1.getWeight() );
		System.out.println("height after eat   "+person1.getHeight());
		
		System.out.println("bmi        "+person1.getBmi());
		System.out.println("bmi category     "+person1.getBmiCategory());
	}

}
