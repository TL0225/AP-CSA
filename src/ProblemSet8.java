/*Timothy Leung
B-Band
11/2/21 APCSA */

import java.util.*;
public class ProblemSet8 {
	public static void main(String args[]) {

		int evenSum = 0;
		Scanner keyboard = new Scanner(System.in);
		int[] ages = new int[12];
		for(int i = 1 ; i <= (ages.length - 1); i++)

		{
		System.out.println("What is the age of this family member?");
		ages[i] = keyboard.nextInt();{
			if (ages[i]%2 == 0)
		{
			evenSum = evenSum + ages[i];
		}

		}

		System.out.println("The sum of all the ages of family members that are of even quantity: " + evenSum);
	}
}
}

