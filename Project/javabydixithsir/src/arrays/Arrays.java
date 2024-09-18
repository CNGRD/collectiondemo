package arrays;

public class Arrays {

	public static void demo1(char[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			if(i<b.length-1)
			{
				System.out.print(",");
			}
			else
				System.out.print(" ");
		}
	}
	public static void demo2(String[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static void demo3(double[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}public static void demo4(float[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
