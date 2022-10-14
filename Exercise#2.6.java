/* This program reads an integer between 0 and 1000 and adds all the digits in that integer */

import java.util.Scanner; //importing scanner class

public class Main{
    public static void main(String args[]){
      
        Scanner input = new Scanner(System.in); //creating a new Scanner class object
        
        //prompt the user to enter the subtotal and a gratuity rate
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        
        //create variables to compute and store values of the digits of "num." 
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        
        //add the digits in the Integer
        int result = hundreds + tens + ones;
        
        //display the result
        System.out.println("The sum of the digits in " + num + " is " + result);
        
    }
}

SAMPLE OUTPUT:
Enter a number between 0 and 1000: 432
The sum of the digits in 432 is 9
