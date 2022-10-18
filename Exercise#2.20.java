/* This program eads the balance and the annual percentage interest rate and displays the interest for the next month. */

import java.util.Scanner; //importing a scanner class

public class InterestCalculator
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creating a new scanner class Object
		
		//prompt the user to enter the balance and interest rest
		System.out.print("Enter the balance and interest rate: ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		//calculate the interest
		double interest = balance * (interestRate / 1200);
		
		//display the interest
		System.out.println("The interest is " + interest);
	}
}
