/* This program calculates the wind-chill temeprature using the formula:
     twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16,
where a is the outside temperature measured in degrees Fahrenheit, v is the speed 
measured in miles per hour, and twc is the wind-chill temperature. The formula cannot 
be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F. */

import java.util.Scanner; //importing the scanner class

public class WindChill
{
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in); //creating a new scanner class
		
		//prompt the user to enter the temperature
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temp = input.nextDouble();
		
		//prompt the user to enter the wind speed
		System.out.print("Enter the wind speed (7 = 2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		//calculate the wind-chill temperature
		double v = Math.pow(windSpeed, 0.16);
		double windChill = 35.74 + (0.6215 * temp) - (35.75 * v) + (0.4275 * temp * v);
		
		//display the results
		System.out.println("The wind chill index is " + windChill);
		
	}
}
