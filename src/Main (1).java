// Timothy Leung |  B-Band | AP CSA | Problem Set #2
import java.util.*;
public class Main {
	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String FirstExample = keyboard.nextLine();

		String rFirstExample = ""; // "Allocates space as second string called rFirstExample

		char T; // Initiates T for character

		for (int i = 0; i < FirstExample.length(); i++) { // For Loop
		T = FirstExample.charAt(i); // returns a charater from given position at i
		rFirstExample = T + rFirstExample; // rFirstExample (ReversedString) puts character in front of second string
		}
		System.out.println("The Reversed String: " + rFirstExample);

	}
}

