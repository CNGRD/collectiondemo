package arrays;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int k=1;
		System.out.println("Enter the Number of rows");
		int r=sc.nextInt();
		System.out.println("Enter the Number of Columns");
		int c=sc.nextInt();
		int [][] a=new int[r][c];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j]=k;
				k++;
			}
			
		}
		for (int i = 0; i< a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
