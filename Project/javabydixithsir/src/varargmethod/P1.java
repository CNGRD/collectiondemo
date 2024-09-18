package varargmethod;

public class P1 
{

	public static void main(String[] args) 
	{
		add1(11);
		add1(12,20);
		add1(12,45,76);
		add1(11,55,78,99);
	}
	public static void add(int a,int b)
	{
		System.out.println("add(int a,int b)");
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("add(int a,int b,int c)");
	}
	public static void add(int a,int b,int c,int d)
	{
		System.out.println("add(int a,int b,int c,int d)");
	}
	public static void add1(int ...arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
