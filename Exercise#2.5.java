/* This program reads the subtotal and gratuity rate, then computes the gratuity and total */  

import java.util.Scanner; //importing scanner class

public class GratuityAndTotal{
    public static void main(String args[]){
      
        Scanner input = new Scanner(System.in); //creating a new Scanner class object
        
        //prompt the user to enter the subtotal and a gratuity rate
        System.out.print("Enter the subtotal and gratiuty rate(%): ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        //create variables to store and compute the values of gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        
        //display the results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        
    }
}
