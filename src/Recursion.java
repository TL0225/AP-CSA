// Timothy Leung || B-Band || AP CSA || Problem Set #3
// Write a program using recurison method to compute any factorial.
// For example 4! = 24
// 5! = 120

import java.util.*;

public class Recursion {
public static void main (String args[]) {

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a value: ");
int n = keyboard.nextInt();

int factorial = fact(n);

System.out.println("Factorial of " + n + " is " + factorial);
}

public static int fact(int n) {
	if (n > 1 )
	{
	return n*fact(n-1); }
	return n;
	}
}

//The two steps for recursion
// 1. Stop condition
// 2. A recursive
