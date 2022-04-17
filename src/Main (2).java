// Timothy Leung |  B-Band | AP CSA | Problem Set #2 | Please write a program that will tell if a phrase/sentence is a palindrome
// Palindrome: a word, phrase, or sequence that reads the same backward as forward
import java.util.*;
public class Main {
	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter String ");
		String FirstExample = keyboard.nextLine();
		String rFirstExample = ""; // "Allocates space as second string called rFirstExample

		for (int i = FirstExample.length() - 1 ; i >= 0; i--) { // For Loop , i = length of the first string; goes backwards to read from right to left
		rFirstExample = rFirstExample + FirstExample.charAt(i); // returns character from  given position at i, adds on to reversed string which is empty value but initialized
		}

		if (rFirstExample.equalsIgnoreCase(FirstExample)) //if statement, using equalsIgnoreCase to ignore capaitalization difference
														  //and only returns if the value of the strings are equal
		{
			System.out.println("Palindrome = True "); // if both strings equal in value, palindrome is true, otherwise palindrome is false
			} else {
				System.out.println("Palindrome = False ");
		}
	}
}

