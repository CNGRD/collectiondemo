package arrays;
import java.util.Scanner;
public class TwoDintArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows and cols");
		int rw=s.nextInt();
		int col=s.nextInt();
		int[][] a=new int[rw][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;i<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}

}
