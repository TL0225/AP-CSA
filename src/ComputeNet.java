/* Timothy Leung
B-Band
APCSA */

import java.util.*;
public class ComputeNet {
	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter # of hours worked:");
		double hoursWorked = keyboard.nextDouble();

		System.out.println("Enter Hourly Pay Rate");
		double pay = keyboard.nextDouble();
		double GrossPay = pay * hoursWorked;

		if(GrossPay <= 300) {
			System.out.println("Your Withholding Percentage is 10%");
			double NetPay = GrossPay * 0.9;
			System.out.println("Your NetPay is " + NetPay);

		} else if(GrossPay <= 400 && GrossPay >= 300.01) {
			System.out.println("Your Withholding Percentage is 12%");
			double NetPay = GrossPay * 0.88;
			System.out.println("Your NetPay is " + NetPay);

		} else if(GrossPay <= 500 && GrossPay >= 400.01) {
			System.out.println("Your Withholding Percentage is 15%");
			double NetPay = GrossPay * 0.85;
			System.out.println("Your NetPay is " + NetPay);

		} else if(GrossPay >= 500.01) {
			System.out.println("Your Withholding Percentage is 20%");
			double NetPay = GrossPay * 0.8;
			System.out.println("Your NetPay is " + NetPay);

			}
		}
}