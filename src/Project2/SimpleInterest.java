/*Timothy Leung
B-Band
Project #2 
Today's task is to modify the program created in class today. You will modify the code so that 
the interest earn will be returned to the main class from the method/function. In other words, if you invested $1000 at10% over 10 years you should earn interest of $1000. this mean you will have $2000
after 10 years ( the original ($1000 plus the interest you earn of $1000). This answer should be returned and printed from the 
main class.

*/

import java.util.*;
public class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much money do you have (P-Value):");
		double p = keyboard.nextDouble();
		System.out.println("What is the annual interest rate (R-Value) as a decimal:");
		double r = keyboard.nextDouble();
		System.out.println("How many years (T-Value):");
		double t = keyboard.nextDouble();
		double SimpleInterest = SimpleInterest(p,r,t);
		System.out.println("The investment made with, " +p + ", with an annual interest rate of, " +r + "," +
	"\n with " + t + " Years, generates a Simple Interest of " + SimpleInterest);
		double SITotal = SITotal(p, SimpleInterest);
		System.out.println("Overall total including Interest is: " + SITotal);
	}
	public static double SimpleInterest(double p, double r, double t)
	{
			double SimpleInterest = p*r*t;
			return SimpleInterest;
	}
	public static double SITotal(double p, double SimpleInterest)
	{
		double SITotal = p + SimpleInterest;
		return SITotal;
	}
}
