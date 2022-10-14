/* This program reads a number in feet and converts it into meters and displays the result in meters
1 foot = 0.305meters */

import java.util.Scanner; //importing Scanner class

public class FeetMeters
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
    
	    
	    //prompt the user to enter a number in feet
		  System.out.print("Enter a value for feet: ");
		  double feet = input.nextDouble();
    
		
		  //creating the variables to calculate and store the value in meters
		  double meters = 0.305 * feet;
    
		
		  //display the results
		  System.out.println(feet + " feet is " + meters + " meters."); 
    
	}
}
