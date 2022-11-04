/*
This program prompts the user to enter the number of years and displays the population projection.
The data used in this program is from exercise 1.11

SAMPLE RUN:
Enter the number of years: 5
The population in 5 years is 325932969
*/


import java.util.Scanner; // importing scanner class

public class PopulationProjection {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter the number of years
		  System.out.print("Enter the number of years: ");
		  int years = input.nextInt();
		  
		  // create variables and store values of birth, death, and immigrant rates.
		  int currentPopulation = 312032486; // current population
		  int birthRate = 31536000 / 7;
		  int deathRate = 31536000 / 13;
		  int immigrantRate = 31536000 / 45;
    
      // calculate the future population
		  int futurePopulation = currentPopulation + (((birthRate) - (deathRate) + (immigrantRate)) * years);
		
		// display the population
		System.out.println("The population in " + years + " is " + futurePopulation);
    
	}
}
