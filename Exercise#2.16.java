/* This program that prompts the user to enter the side of a hexagon and displays its area. 
The formula for computing the area of a hexagon is
                        Area = 3√3 / 2 s^2, where s is the length of a side. */

import java.util.Scanner; //importing the scanner class

public class AreaOfHexagon
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new scanner class object
		
		//prompt the user to enter the side of the hexagon
		System.out.print("Enter the length of the side: ");
		double lengthOfSide = input.nextDouble();
		
		//calcuate the area
		double areaOfHexagon = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(lengthOfSide, 2);
		
		//display the results
		System.out.println("The area of the hexagon is " + areaOfHexagon);
		
	}
}
