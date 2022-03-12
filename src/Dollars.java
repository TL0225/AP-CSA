/*
Timothy Leung
B-Band
Project #3 #10: Write a class / program  that calculate the  and display the conversion of $57 into dollar
bills from 20, 10,5,1. it should display how many 20 dollars, how many $10, how many $5 and how many $1 bills are in 57 dollars. */

import java.util.* ;
public class Dollars {
    public static void main(String args[]) {

// Allows input from keyboard to console
	Scanner keyboard = new Scanner(System.in);

	System.out.println(" How many dollars do you have: ");
	int AmountDollars = keyboard.nextInt();

// ^ Used AmountDollars as the variable


// Wants bills --> 20, 10, 5, 1 (4 seperate bills) ; probably 5 integers?

	int twenties = (AmountDollars/20); // Takes 57 divides by 20 = 2 with 17 remainder
	int tens = (AmountDollars - 20*twenties)/10; // Takes 57 subtract 20*2) divides by 10
	int fives = (AmountDollars - (10*tens + 20*twenties))/5;
	int ones = (AmountDollars - (10*tens + 20*twenties + 5*fives));

System.out.println("Entered $ Amount " + AmountDollars );
System.out.println("That is " + twenties + " twenties, " + tens + " tens, " + fives + " fives, and " + ones + " ones.");


}
}
