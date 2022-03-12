import java.util.*;

class TwoDimensionalScanner {
	public static void main(String args[]) {
		int sum, row, column, i, j = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row length of an array : ");
		row = sc.nextInt();
		System.out.println("Enter Column length of an array : ");
		column = sc.nextInt();

		int a[][] = new int[row][column];
		System.out.print("Enter " + (row*column) + " Elements to store in Array :\n");

		for (i = 0; i < row; i++)
		{
			 for(j = 0; j < column; j++)
			 {
				 a[i][j] = sc.nextInt();
			 }
		 }
		 System.out.print("Elements in Array are :\n");
		 for(i = 0; i < row; i++) {
			 for(j = 0; j < column; j++)
			 {
				 System.out.print(a[i][j] + " ");
				 }
			System.out.println();
		}
		 for(i = 0; i < row; i++) {
			 sum = 0;
			 for(j = 0; j < column; j++) {
				 sum = sum + a[i][j];
				 System.out.println("\nThe Sum of Elements in  " + i + " row " + j + " column is = " + sum);
		}
 }
}
}
