import java.util.*;
public class Lawn2 {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the length of the lawn");
		double length = keyboard.nextDouble();

		System.out.println("Enter the width of the lawn");
		double width = keyboard.nextDouble();

		double Area = length * width;

		if(Area < 400) {
			System.out.println("The weekly fee for mowing the lawn is $25 per week");
			double WeekFee = 25;

		} else if(Area >= 400 && Area <= 600) {
			System.out.println("The weekly fee for mowing the lawn is $35 per week");
			double WeekFee = 35;

		} else if(Area <= 600) {
			System.out.println("The weekly fee for mowing the lawn is $50 per week");
			double WeekFee = 50;
		}

		System.out.println("How often would you like to pay? \n Enter (1): Once \n Enter (2): Twice \n Enter (3): Twenty Times per year");
		double longevity = keyboard.nextDouble();

		if(longevity == 1) {
			double SeasonFee = WeekFee * 20;

	}
	}
}