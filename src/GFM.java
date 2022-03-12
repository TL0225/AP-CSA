//Timothy Leung
//B-Band AP CSA

import java.util.*;
public class GFM
{
  public static void main (String[] args)
  {

    boolean choice = false;
    char[] grades = {'E','G','S','N','U'};
    double[] money = {100,80,60,30,40};
    int match = 0;
    char LetterGrade = 0;

    Scanner keyboard = new Scanner(System.in);
	System.out.println("What grade did you recieve for AP Computer Science A?");
	int entry = keyboard.nextInt();
	if(entry >= 90) {
			LetterGrade = 'E';
	System.out.println("Your parents aren't beating you today! \nYour grade at Murrow is an " + grades[0] + " on your report card.");
	} else if(entry <= 89 && entry >=80) {
			LetterGrade = 'G';
	System.out.println("It's not that hard to get an E! \nYour grade at Murrow is an " + grades[1] + " on your report card.");
	} else if (entry <= 79 && entry >=65) {
			LetterGrade = 'S';
	System.out.println("Your grade at Murrow is an " + grades[2] + " on your report card.");
	} else if (entry <= 64 && entry >= 55) {
	System.out.println("Below State Average!\nYour grade at Murrow is an " + grades[3] + " on your report card.");
			LetterGrade = 'N';
	} else if (entry <= 50 && entry >= 40) {
			LetterGrade = 'U';
	System.out.println("You need to study more!\nYour grade at Murrow is an " + grades[4] + " on your report card.");

	} for (int i = 0; i < 5; i++)
	  if (LetterGrade == (grades[i]))
	{
		  choice = true;
		  match = i;
	}
	if(choice == true) {
	System.out.println("\nYour Grade is a " + entry + "\nYou will recieve $" + money[match] + " through the transaction of a debit card."); }
	else
    System.out.println("Invalid Entry, please restart program.");
		}
	}























    /* for (int i = 0; i < 4; i++)
    if (entry.equals(grades[i]))
    {
	  choice = true;
	  match = i;
    }

    if(choice == true)
          System.out.println("You will recieve $" + money[match] + " through the transaction of a debit card.");
    else
   System.out.println("Invalid Entry, please restart program.");

  }
}
*/