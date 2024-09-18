package exceptions;

public class ExceptionPropagation 
{
	static void demo()
	{
		System.out.println("demo() starts");
		int res=10/0;
		System.out.println("demo() ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try {
		demo();
		System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();//debugging
		}
		System.out.println("main ends");
		
	}

}
