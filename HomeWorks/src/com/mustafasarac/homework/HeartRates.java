package com.mustafasarac.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private int age;
	private int maxRate;
	private int idealMaxRate;
	private int idealMinRate;
	
	HeartRates() {
		
	}
	
	public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.age = calculateAge();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		age = calculateAge();
		return age;
	}

	public int getMaxRate() {
		this.maxRate = 220 - this.age;
		return maxRate;
	}
	
	public int getIdealMaxRate() {
		idealMaxRate = (int) ((220 - this.age) * 0.85);
		return idealMaxRate;
	}	
	
	public int getIdealMinRate() {
		idealMinRate = (int) ((220 - this.age) * 0.50);
		return idealMinRate;
	}	
	
	private int calculateAge() {	
	    // Calculate Age
	    LocalDate start = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
	    LocalDate end = LocalDate.now();
	    age = (int)ChronoUnit.YEARS.between(start, end);
		return age;
	}
		
	public void showPersonInfo() {
		
		getMaxRate();
		
		getIdealMaxRate();
		
		getIdealMinRate();
		
		System.out.printf(" First Name: %s \n Last Name %s \n Age: %d \n Max: %d \n Range %d - %d \n",
				this.firstName,this.lastName,this.age,this.maxRate,this.idealMinRate,this.idealMaxRate);
	}
	

	
}
