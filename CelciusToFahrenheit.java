/* This program reads a Celcius degree(in a double value) from the user and then converts it into fahrenheit
And displays the results */

import java.util.Scanner; //importing Scanner class

public class CelciusToFahrenheit
{
	public static void main(String[] args) {
    
	    Scanner input = new Scanner(System.in); //creating a new Scanner class object
	    
	    //prompt the user to enter the temperature in degree celcius
		  System.out.print("Enter a degree in Celcius: ");
		  double celcius = input.nextDouble();
		
		  //convert the input(celcius) to fahrenheit
		  double fahrenheit; //intializing the variable
		  fahrenheit = (9 / 5.0) * celcius + 32; //using 5.0 instead of 5 to avoid "integer division"
		
		  //display the results
		  System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
	}
}
