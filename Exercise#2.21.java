/* This program reads in investment amount, annual interest rate, and number of years and displays the future investment value using the following formula:
                futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) ^ numberOfYears*12
*/

import java.util.Scanner; //importing a scanner class

public class FutureValueCalculator
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creating a new scanner class Object
		
		//prompt the user to enter investment amount
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		//prompt the user to enter annual interest rate
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		//convert the annual interest rate to monthly interest rate
		double monthlyInterestRate = (annualInterestRate / 100 ) / 12;
		
		//prompt the user to enter the number of years
		System.out.print("Enter number of years: ");
		double numYears = input.nextDouble();
		
		//calculate the future investment value
		double pow = numYears * 12;
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), pow);
		
		//display the results
		System.out.println("Future value $" + futureInvestmentValue);
	}
}
