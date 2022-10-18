/* This progrma prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon 
then displays the cost of the trip.
*/

import java.util.Scanner; //importing a scanner class

public class CostOfDriving
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creating a new scanner class Object
		
		//prompt the user to enter distance
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		//prompt the user to enter miles per gallon
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		//prompt the user to enter price per gallon
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		//calculate the cost of driving
		double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
		
		//display the cost
		System.out.println("The cost of driving is $" + costOfDriving);
		
	}
}
