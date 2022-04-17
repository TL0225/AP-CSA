// Timothy Leung | B-Band | APCSA
import java.util.*;
class BinarySearchExample2 {
	public static void main (String args[]) {

		String arr[] = {"Stop", "Tim", "Zhuolin", "Help", "Deng", "Jess"};
		String key = "Tim";
		Arrays.sort(arr);

	int result = Arrays.binarySearch(arr , key);
		if (result < 0 )
			System.out.println("Element is not found!");
		else
			System.out.println("Element: " +  key + " is found at index " + result);
			}
		}
