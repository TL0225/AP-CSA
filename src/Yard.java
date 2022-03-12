//Timothy Leung
//Project #1

import java.util.*;
public class Yard{
public static void main(String args[])
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter width of Yard: ");
	double width = keyboard.nextDouble();
	System.out.println("Enter length of Yard: ");
	double length = keyboard.nextDouble();
	System.out.println("How much does each Sq.Ft cost?: ");
	double cost = keyboard.nextDouble();
	double AOY = AOY(length, width);
	double YardCost = YardCost(AOY, cost);
	System.out.println("The Area of the Yard with length of " + length + "+ Width of " + width + "is:" + AOY);
	System.out.println("The Area of the Yard is: " + YardCost);
}
public static double AOY(double l, double w)
{
	double AOY = l*w;
	return AOY;
}
public static double YardCost(double AOY, double cost)
{
	double YardCost = AOY * cost;
	return YardCost;
	}
}