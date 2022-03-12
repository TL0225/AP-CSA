/*Timothy Leung
B-Band
AP CSA */

import java.util.*;
	public class Investment {
		public static void main (String args[]) {

			Scanner keyboard = new Scanner(System.in); // Essentially scans for any inputs from the outside to be placed inside
			System.out.println("Enter inital amount: "); //Prints this statement
			double P = keyboard.nextDouble(); // Initalizes P as the first Double entered
			System.out.println("Enter annual return rate as a decimal: "); //Prints this statement
			double R = keyboard.nextDouble(); // Inititalizes R as the second double entered
			System.out.println("Enter the amount of years: "); //Prints this statement
			double T = keyboard.nextDouble(); // Initailizes T as the third double entered

			double SimpleInterest = P * R * T; // Multiplies P, R, T together to get SimpleInterest
			double TotalAmount = P + SimpleInterest;

		if(P == 0 || T == 0 || R == 0) { //if statement where if P or T or R is equal to 0, then an Error would be printed out
			System.out.println("***********    There is an error with your values. One of your values is equal to 0.    *********"); //Prints this statement out
		}
		else
		{
		System.out.println("Starting Initial Amount: " + P + "\nTotal SimpleInterest: " + SimpleInterest + "\nYour new total is: " + TotalAmount ); //if P or T or R is any value other than 0, then it prints out the SimpleInterest
			}
		}
	}
