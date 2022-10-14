/* This program prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds, 
then displays the average acceleration. */

import java.util.Scanner; //importing scanner class

public class AvgAcceleration{
    public static void main(String args[]){
      
        Scanner input = new Scanner(System.in); //creating a new Scanner class object
        
        //prompt the user to enter the initial, finals velocities and time.
        System.out.print("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        //create a variable to calculate and store the value of average acceleration.
        double avgAcc = (v1 - v0) / t;
        
        //display the acceleration
        System.out.println("The average acceleration is " + avgAcc + "m/s2.");
        
        
    }
}

SAMPLE OUTPUT: 
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889m/s2.
