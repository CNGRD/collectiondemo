package arrays;

public class ReverseElements
{
	public static void demo(int[] b)
	{
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
			if(i<=b[0])
			{
				System.out.print(",");
			}
			else
				System.out.print(" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		demo(a);
		
	}
	

}
