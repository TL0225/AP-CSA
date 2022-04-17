// Timothy Leung | B-Band | AP CSA | Test #1
import java.util.*;
public class homework {

	public static int[] RandomNumbers(int n) { //Method that generates random numbers, using "RandomNumbers" as the title of the method
		int [] array = new int[n]; // initalizing space for n values. Integer 'n' is specified from the main class
		for (int i = 0; i < n; i++) { // For loop to create random numbers using Math.random. 'n' substitutes the .length in the forloop
			array[i] = (int) (Math.random() * 100); } //Creation of random numbers through Math.random

		return array; // Returns array back to main class
	}

	public static void printArray(int[] values) {			//Method that prints and finds any duplicates in an array

		for (int i = 0; i < values.length; i++) {		// for loop
			System.out.print(values[i] + " "); }        // two print statements
			System.out.println();
			int count = 0;   // counter to find duplicates set at count = 0
	for(int i = 0; i < values.length; i++) {        // 2nd for loop
			for(int j = i + 1; j < values.length; j++) {
			 if(values[i] == values[j]) {              // if else statement that saids if there are more than one duplicate, it prints statement with (s) otherwise, only singular
		        System.out.println("Duplicated Elements: " + values[j] );     // print statement
				count++;        // count + 1 to sort through array to find duplciates
                if(count > 1) {
                System.out.print("Number " + values[j] + " repeats " + count + " more time(s)."); }
				else {
					System.out.print("Number " + values[j] + " repeats " + count + " more time."); }

				}

			}

		}
	}

public static void main (String[] args) { // Main Class
	int[] values = RandomNumbers(20); // I am allocating space for the array I called "values" and using the generateRandom method to generate X numbers. In this case, I am generating 20 random values
	System.out.println("Randomly Generated Array / Not Sorted: "); // Print Statement #1
	printArray(values); // Directly Calls the array and prints the first array
	System.out.println("\nSorted array "); // Print Statement #2
	Arrays.sort(values); // Using Arrays.sort method to sort the first array from lowest to greatest, making it simplier and efficient
	printArray(values); // Directly Calls the array and prints the first array

	}
}









