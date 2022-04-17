/* Timothy Leung
B-Band
AP CSA */

import java.util.*;
public class SearchArray {
	public static void main (String args[]) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter declared integer:" );
	int number = keyboard.nextInt();
	int [] Num = {56,12,66,54,75,38,31,68,30,10};

	for(int i = 0; i < Num.length; i++) {
		if(number == Num[i]) {
			System.out.println("The integer of " + number + " is a match."); }
			else if(number != Num[i]) {
			System.out.println("The integer of " + number + " is NOT a match");
			}
		}
	}
}