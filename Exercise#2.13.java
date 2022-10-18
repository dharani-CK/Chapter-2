/* This program prompts the user to enter a monthly saving amount and displays the account value after the sixth month. */

import java.util.Scanner; //creating a scanner class

public class MonthlyInterest
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new scanner class object
		
		//prompt the user to enter the monthly saving
		System.out.print("Enter the monthly saving amount: $");
		double savingAmount = input.nextDouble();
		
		double annualInterestRate = 0.05; //annual interest rate
		double monthlyInterestRate = annualInterestRate / 12; //calculating the monthly interest rate
		
    //calculating the amount for every month
		double firstMonthAmount = savingAmount * (1 + monthlyInterestRate);
		double secondMonthAmount = (savingAmount + firstMonthAmount) * (1 + monthlyInterestRate);
		double thirdMonthAmount = (savingAmount + secondMonthAmount) * (1 + monthlyInterestRate);
		double fourthMonthAmount = (savingAmount + thirdMonthAmount) * (1 + monthlyInterestRate);
		double fifthMonthAmount = (savingAmount + fourthMonthAmount) * (1 + monthlyInterestRate);
		double sixthMonthAmount = (savingAmount + fifthMonthAmount) * (1 + monthlyInterestRate);
		
		
		//display the results
		System.out.println("After the sixth month, the account value is $" + sixthMonthAmount);
		
	}
}
