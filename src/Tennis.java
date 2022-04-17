/* Timothy Leung
B-Band APCSA
If you want to play tennis , it must not be raining and the temperature must be greater than 65 degrees AND  (&&) less than 95 degrees.
OR  if you have an you have access to an indoor tennis court you can play tennis indoor . Otherwise you cannon play tennis. */

import java.util.*;
public class Tennis {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the current temperature?: ");
		double temp = keyboard.nextDouble();
		boolean isRaining = true;
		boolean inDoorTennisCourt = false;

	if (temp >= 65 && temp < 95 && isRaining == false) {
			System.out.println("Go do your daily exercise." ); }
		else if (temp >= 65 && temp < 95 && isRaining == false && inDoorTennisCourt == true) {
			System.out.println("You can play at the Tennis Court instead of your backyard!" ); }
		else{
		if (inDoorTennisCourt == false && isRaining == true){
				System.out.println("Go play another day! ^_^"); }
		}
	}
}
