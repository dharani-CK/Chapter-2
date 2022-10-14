/* This program calculates the energy needed to heat water from an initial temperature to a final temperature. 
This program prompts the user to enter the amount of water in kilograms and the initial and final temperatures of the water. 
The formula to compute the energy is
        Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, initial and final temperatures are in 
degrees Celsius, and energy Q is measured in joules.*/ 

import java.util.Scanner; //importing scanner class

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //creating a new Scanner class object
        
        //prompt the user to enter the amount of water
        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();
        
        //prompt the user to enter the initial temperature
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        
        //prompt the user to enter the final temperature
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        //create a variable to compute and store a value for the energy required
        double energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184;
        
        //display the result
        System.out.println("The energy needed is " + energyNeeded + "J");
        
        
    }
}

SAMPLE OUTPUT:
Enter the amount of water in kilograms: 55.5
Enter the initial temperature: 3.5
Enter the final temperature: 10.5
The energy needed is 1625484.0J
