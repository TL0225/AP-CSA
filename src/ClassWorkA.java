/*Timothy Leung
B-Band
11/2/21 APCSA */

import java.util.*;
public class ClassWorkA {
	public static void main(String args[]) {
		int [] ages = new int [3];
		Scanner keyboard = new Scanner(System.in);
		double product = 1;
		for(int i = 0 ; i <= (ages.length - 1) ; i++)
		{
			System.out.println("What is the age of this family member? ");
			ages[i] = keyboard.nextInt();
			product = product * ages[i];
		}
		System.out.println("The product of all the ages of family members: " + product);
	}
}

