package com.mustafasarac.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HealthProfile {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private int age;
	private int maxRate;
	private int idealMaxRate;
	private int idealMinRate;
	private double bmi;
	private double weight;
	private double height;
	private String resultWeight;
	
	HealthProfile() {
		
	}
	
	public HealthProfile(String firstName, String lastName, String gender, int birthDay, int birthMonth, int birthYear, double weight, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.age = calculateAge();
		this.bmi = getBmi();
		this.weight = weight;
		this.height = height;
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
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	
	public double getBmi() {
		// Calculate BMI
		// BMI (Body Mass Index) = weight in kilograms/ (height in meters*height in meters)
		
		bmi =  weight / ((height / 100) * 2) ;
		
		/*
			BMI is less than 18.5 Underweight 
			BMI is 18.5 to 24.9  Normal weight 
			BMI is 25 to 29.9  Overweight
			BMI is 30 or more  Obese
		 */
		
		if (bmi < 18.5) {
			this.resultWeight = "Underweight";
		} else if (bmi > 18.5 && bmi < 24.9) {
			this.resultWeight = "Normal weight";
		} else if (bmi > 25 && bmi < 29.9) {
			this.resultWeight = "Over weight";
		} else {
			this.resultWeight = "Obese";
		}
		
		return bmi;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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
		
		getBmi();
		
		System.out.printf(" First Name: %s \n Last Name: %s \n Gender: %s \n Age: %d \n Max: %d \n Range %d - %d \n BMI: %f \n BMI State: %s \n",
				this.firstName,this.lastName,this.gender,this.age,this.maxRate,this.idealMinRate,this.idealMaxRate, this.bmi, this.resultWeight);
	}
	
}
