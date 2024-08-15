/*  
 This code will ask the user to input personal information 
 
 Author: Sam G. Nissan
 Date: 08/14/2024
 */

package individualsInfo;

import java.util.Scanner;

public class individualsInfo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  //Scanner "input" object to enable user input from the keyboard
		
		String firstName;
		String lastName;
		String streetAddress;
		String city, state;
		int zipCode;
		
		System.out.print("Please entre your first Name: ");
		firstName = input.nextLine();
		
		System.out.print("Please enter your last Name: ");
		lastName = input.nextLine();
		
		System.out.print("Enter your street address: ");
		streetAddress = input.nextLine();
		
		System.out.print("Enter your city name: ");
		city = input.nextLine();
		
		System.out.print("Enter state name: ");
		state = input.nextLine();
		
		System.out.print("Enter your zip code: ");
		zipCode = input.nextInt();
		
		System.out.println();
		
		System.out.println("Full Name       : " + firstName+ " " + lastName);
		
		System.out.println("Current Adress  : " + streetAddress);
		System.out.println("City, State, Zip: " + city + ", " + state +" " + zipCode);
	}
	
}


