// Timothy Leung || B-Band || AP CSA

import java.util.*;

	public class Factorial {
		public static void main (String args[]) {

	Scanner keyboard = new Scanner(System.in); //Scanner function
	System.out.println("Enter a value: "); //Sys.out statement
		int n = keyboard.nextInt();  //initalizing n as an integer for the next input on the user

			int factorial = fact(n); //initalizing factorial as fact(n)

		System.out.println("Factorial of " + n + "! is " + factorial); } //Sys.out statement

			public static int fact(int n) { //fact method
				if (n > 1 ) //if statement
				{
					return n*fact(n-1); } //In this recursion statement, the function will cycle down,
																									//Ex: fact(4) = 4* fact(3) 				(till it hits fact(1) = 1 then at one will cycle back up.)
																									// Ex: Fact(2) = 2 * fact(1) = 2, Fact(3) = 3* fact(2) = 3*2 = 6, Fact(4) = 4 * fact(3) = 4 * 6 = 24
					return n; //return n to line 12 where it gets printed out to line 14
						}
					}

