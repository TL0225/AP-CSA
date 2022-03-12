/* Timothy Leung
B-Band
APCSA */
import java.util.*;
public class Eggs {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		int eggs = keyboard.nextInt();
		NumEggs(eggs);
	}
	public static void NumEggs(int eggs) {
		int DozenEggs = eggs/12;
		int RemainderEggs = eggs%12;
		System.out.println("You have " + DozenEggs + " full dozen eggs with " + RemainderEggs + " remainding.");
	}
}