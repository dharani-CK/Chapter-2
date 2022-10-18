/* This program prompts the user to enter the input as an integer whose last two digits represent the cents. 
For example, the input 1156 represents 11 dollars and 56 cents. */

import java.util.Scanner; //importing a scanner class

public class DollarsAndCents
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creating a new scanner class Object
		
		//prompt the user to enter an Integer
		System.out.print("Enter a four digit integer: ");
		int num = input.nextInt();
		
		//convert the integer into dollars and cents
		int dollars = num / 100;
		int cents = num % 100;
		
		//display the results
		System.out.println("The integer " + num + " represents " + dollars + " dollars " + cents + " cents.");
	}
}
