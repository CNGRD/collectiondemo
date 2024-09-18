package arrays;

public class ProductOfArrays 
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
		int[][] m1= {{1,2},{2,1}};
		int[][] m2= {{3,2},{5,4}};
		int[][] r=new int[m1.length][m1.length];
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m2.length;j++)
			{
				int sum=0;
				for(int k=0;k<m1[0].length;k++)
				{
					sum+=m1[i][k]*m2[k][j];
				}
				r[i][j]=sum;
			}
		}
		display(r);
	}

}
