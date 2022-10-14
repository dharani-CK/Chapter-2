/* This program prompts the user to enter the minutes and displays the maximum number of years and remaining days for the minutes */

import java.util.Scanner; //importing scanner class

public class YearsAndDays{
    public static void main(String args[]){
      
        Scanner input = new Scanner(System.in); //creating a new Scanner class object
        
        //prompt the user to minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        //calculate for the years and remaining days
        int years = minutes / 525600; //A year consists of 525600 minutes
        int remainingDays = (minutes % 525600) / 1440; //a day has 1440 minutes;
        
        //display the results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
        
    }
}

SAMPLE OUTPUT:

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days.
