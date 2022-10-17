/* This program prompts the users to enter their weight in pounds and height in inches then, 
calculates their BMI by converting the weight and height into kilograms and meters */

import java.util.Scanner; //creating a scanner class

public class BMI
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new scanner class object
		
		//prompt the user to enter weight in pounds
		System.out.print("Enter the weight in pounds: ");
		double weight = input.nextDouble();
		
		//prompt the user to enter height in inches
		System.out.print("Enter the height in inches: ");
		double height = input.nextDouble();
		
		//create variables to store and calculate the weight in kg, height in meters
		double weightInKilograms = 0.45359237 * weight;
		double heightInMeters = 0.0254 * height;
    
    //calculate BMI
		double BMI = weightInKilograms / (Math.pow(heightInMeters, 2)); 
		
		//display the results
		System.out.println("BMI is " + BMI);
		
	}
}
