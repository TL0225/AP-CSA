/*Timothy Leung
B-Band APCSA
Write a program using a "for" loop, that prints and adds all multiples of 5 */

public class ProblemSet7
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int x = 0; x<=100; x=x+5)
		{
		System.out.println(x); {
			if(x%5==0)
			sum = sum + x; }
			System.out.println("The sum of all multiples of 5 are: " +sum);
	}
}
}