package patterns;

public class Xpattern 
{

	public static void main(String[] args)
	{
		int a=1;int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			a++;
			System.out.println();
		}
	}

}
