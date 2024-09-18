package patterns;

public class Pattern3 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				int a=1;
				for(int j=1;j<=i;j++)
				{
					
					System.out.print(a +" ");
					//to toggle a value
					if(a==1)
					{
						a=0;
					}
					else
						a=1;
				}
				//System.out.println();
			}
			else
			{
				int a=0;
				for(int j=1;j<=i;j++)
				{
					System.out.print(a+" ");
					//to toggle a value
					if(a==1)
					{
						a=0;
					}
					else
						a=1;
				}
				//System.out.println();
			}
			System.out.println();
		}
	}

}
