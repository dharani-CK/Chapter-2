/*This program takes the weight(input) from the users in pounds and converts it into kilograms and displays the result. */

import java.util.Scanner; //importing Scanner class

public class PoundsToKilograms
{
	public static void main(String[] args) {
    
	    Scanner input = new Scanner(System.in); // creating a new Scanner class object
	    
	    //prompt the user to enter a weight in pounds
		  System.out.print("Enter a number in pounds: ");
		  double pounds = input.nextDouble();
		
		  //convert pounds into kilograms
		  double kilograms = 0.454 * pounds;
		
		  //display the result
		  System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    
	}
}
