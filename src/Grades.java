/*Timothy Leung
B-Band
AP CSA */
import java.util.*;
public class Grades {
	public static void main (String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the grade of the chosen child");
		int grade = keyboard.nextInt();
		char[] LGrade = {'E','G','S','N'}; {
		if(grade >= 90) {
		System.out.println("Your grade at Murrow is an " + LGrade[0] + " on your report card.");
		} else if(grade <= 89 && grade >=80) {
		System.out.println("Your grade at Murrow is an " + LGrade[1] + " on your report card.");
		} else if (grade <= 79 && grade >=65){
		System.out.println("Your grade at Murrow is an " + LGrade[2] + " on your report card.");
		} else if (grade <= 64 && grade >= 55){
		System.out.println("Your grade at Murrow is an " + LGrade[3] + " on your report card.");
        }
}
}
}