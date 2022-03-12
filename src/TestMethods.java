/*
Timothy Leung
B-Band
AP CSA
Project 3 Part 1 */
public class TestMethods
{
	public static void main(String[] args)
	{
		int FirstNum = 50;
		int SecNum = 30;
		displayIt(FirstNum,SecNum);
		displayItTimesTwo(FirstNum,SecNum);
		displayItPlusOneHundred(FirstNum,SecNum);
		}

public static void displayIt(int FirstNum, int SecNum)
{
	System.out.println(FirstNum);
	System.out.println(SecNum);
}
public static void displayItTimesTwo(int FirstNum, int SecNum)
{
	System.out.println(FirstNum*2);
	System.out.println(SecNum*2);
}
public static void displayItPlusOneHundred(int FirstNum, int SecNum)
{
	System.out.println(FirstNum+100);
	System.out.println(SecNum+100);
}
}
