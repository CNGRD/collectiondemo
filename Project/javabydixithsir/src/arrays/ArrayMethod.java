package arrays;

public class ArrayMethod 
{
	public static void demo(int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			if(i<b.length-1)
			{
				System.out.print(" , ");
			}
			else
				System.out.print(" ");
		}
	}
	public static void demo1(double[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			if(i<b.length-1)
			{
				System.out.print(" , ");
			}
			else
				System.out.print(" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		double[] d= {1.2,3.5,4.5};
		demo(a);
		System.out.println();
		demo1(d);
		
	}
	

}
