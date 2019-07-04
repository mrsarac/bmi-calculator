
package com.mustafasarac.homework;

import java.util.Scanner;

public class HeartRatesCalculator {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("*** Heart Rate Calculator *** ");
		
		System.out.print("Please enter your name: ");
        String firstName = scanner.nextLine();
		
		System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();
		
		System.out.print("Please enter your birth day: ");
        int birthDay = scanner.nextInt();

		System.out.print("Please enter your birth month: ");
        int birthMonth = scanner.nextInt();
        
		System.out.print("Please enter your birth year: ");
        int birthYear = scanner.nextInt();        

        // Creating Person
        HeartRates person = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
       
        /*
        // Settings values
        person.setFirstName(firstName);
        person.setLastName();
        person.setBirthDate(birthDay, birthMonth, birthYear );
        */

        person.showPersonInfo();
        
        /*
        // Some Get Methods
        System.out.println( "Get MaxRate: " + person.getMaxRate() );
        System.out.println( "Get IdealMaxRate: " + person.getIdealMaxRate() );
        System.out.println( "Get IdealMinRage: " + person.getIdealMinRate() );
        */
        
	}

}
