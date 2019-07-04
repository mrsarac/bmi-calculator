package com.mustafasarac.homework;

import java.util.Scanner;

public class BMIRatesCalculator {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("*** BMI Calculator *** ");

		System.out.print("Please enter your name: ");
        String firstName = scanner.nextLine();
		
		System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();

		System.out.print("Please enter your gender: ");
        String gender = scanner.nextLine();
      
		System.out.print("Please enter your weight (KG): ");
        double weight = scanner.nextDouble();
        
		System.out.print("Please enter your height (CM): ");
        double height = scanner.nextDouble();        

		System.out.print("Please enter your birth day: ");
        int birthDay = scanner.nextInt();

		System.out.print("Please enter your birth month: ");
        int birthMonth = scanner.nextInt();
        
		System.out.print("Please enter your birth year: ");
        int birthYear = scanner.nextInt();   
        


        // Creating Person
        HealthProfile person = new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, weight, height);
        
       
        /*
        // Settings values
        person.setFirstName(firstName);
        person.setLastName();
        person.setBirthDate(birthDay, birthMonth, birthYear );
        */

        person.showPersonInfo();
        
                
        /*
        // Some Get Methods
        System.out.println( "Get BMI: " + person.getBmi() );
        System.out.println( "Get MaxRate: " + person.getMaxRate() );
        */
        
	}

}
