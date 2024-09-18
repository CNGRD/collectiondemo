package arrays;

public class AdditionOfMatrices 
{
	public static void display(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[][] m1= {{1,2,3},{5,3,1},{9,7,2}};
		int[][] m2= {{1,9,2},{3,-11,2},{10,5,-1}};
		int[][] r=new int[m1.length][m1.length];
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				r[i][j]=m1[i][j]+m2[i][j];
			}
		}
		display(m1);
		System.out.println();
		display(m2);
		System.out.println();
		display(r);
	}

}
