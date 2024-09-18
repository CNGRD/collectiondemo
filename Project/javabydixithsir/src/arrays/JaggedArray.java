package arrays;
import java.util.Scanner;
public class JaggedArray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=s.nextInt();
		int[][] a2D=new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter number of cols for rows :"+(i+1));
			int col=s.nextInt();
			a2D[i]=new int[col];
			for(int j=0;j<col;j++)
			{
				System.out.println("enter the value to "+i+" "+j);
				a2D[i][j]=s.nextInt();
			}
			
		}
		for(int i=0;i<a2D.length;i++)
		{
			for(int j=0;j<a2D[i].length;j++)
			{	
				System.out.print(a2D[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
