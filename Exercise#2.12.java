/* This program prompts the user to enter v in meters/second (m/s) and 
the acceleration a in meters/second squared (m/s2), then displays the minimum 
runway length.
           Length = v^2/2a 
*/

import java.util.Scanner; //importing scanner class

public class Main{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a scanner class object
		
    //prompt the user to enter speed and acceleration
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
    //creating a variable to store and compute the runway length
		double runwayLength = (Math.pow(speed, 2)) / (2 * acceleration);
    
    //display results
		System.out.println("The minimum runway length for this airplane is " + runwayLength);
		
	}
}
