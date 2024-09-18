package arrays;

public class Program1 {

	public static void main(String[] args) 
	{
		int [][] a=new int[3][3];
//		a[0][0]=10;
//		a[0][1]=0;
//		a[1][0]=10;
//		a[1][1]=15;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
