/*Timothy Leung
B-Band
Project #2 */

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
