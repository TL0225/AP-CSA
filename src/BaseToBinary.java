/* Timothy Leung B-Band AP Computer Science A */
/* Please create a program that will convert any base 10 number into a binary number. */
import java.util.*;
public class BaseToBinary {
	public static void main(String args[]) {

		int i = 1,baseNumber, q;

		int arr[] = new int[100]; //Delcaring an array, allocating 100 space

		Scanner keyboard = new Scanner(System.in); //Using scanner function to get keyboard input
		System.out.print("Input a base 10 number: "); //Print Out Statement
		baseNumber = keyboard.nextInt();

		q = baseNumber; //Quot = Quotient ; Make Quot = baseNumber to use the value of baseNumber to find the binary number

		while (q != 0) { //Writing a while loop, where quot does not equal 0 to get all values other than 0. Binary excludes 0
			arr[i++] = q%2; //Find remainder 2 of Quotient
			q = q/2; } //Takes Quotient and divides it by 2

		System.out.print("The binary number is: ");
		for(int j=i-1; j>0; j--) { //For Loop array
			System.out.print(arr[j]); //Prints int J from array.
		}
		System.out.println("");
	}
}
