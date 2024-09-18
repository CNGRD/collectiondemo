package arrays;
import java.util.Scanner;
public class TwoDintArray1 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[][] a2d= {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		for(int i=0;i<a2d.length;i++)
		{
			for(int j=0;j<a2d[i].length;j++)
			{
				System.out.print(a2d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
