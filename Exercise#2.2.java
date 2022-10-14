/* This program reads on the radius and length of a cylinder and computes the area and volume, using the formulas
area = radius * radius * π
volume = area * length */

import java.util.Scanner; //importing Scanner class

public class AreaAndVolume
{
	public static void main(String[] args) {
    
	    Scanner input = new Scanner(System.in); //creating a new Scanner class object
	    
	   //prompt the user to enter the radius and length of cylinder
		 System.out.print("Enter the radius and length of a cylinder: ");
		 double radius = input.nextDouble();
		 double length = input.nextDouble();
		
		 //using the final method to store the value of PI
		 final double PI = 3.14159265358979323846;
		
		 //creating the variables to calculate and store the values of area and volume
		 double area = radius * radius * PI;
		 double volume = area * length;
		
		 //display the results
		 System.out.println("The area is " + area);
		 System.out.println("The volume is " + volume);
	}
}
