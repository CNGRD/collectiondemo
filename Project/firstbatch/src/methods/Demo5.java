package methods;

public class Demo5 
{
	public static int add(int a)
	{
		a=a+10;
		return a;
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		int res=add(5);
		System.out.println(res);
		System.out.println("main ends");

	}

}
