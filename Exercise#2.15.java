/* This program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance. 
The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. */

import java.util.Scanner; //creating a new scanner class

public class DistanceBetweenTwoPoints
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new Scanner class
		
		//prompt the user to enter the coordinates of first points
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//prompt the user to enter the coordinates second points
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//calculate the distance
		double d = Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2);
		double distance = Math.pow(d, 0.5);
		
		//display the results
		System.out.println("The distance between the two points is " + distance);		
		
	}
}
