package questions_on_exception;

public class Q2 
{

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("N");
			int n=60/0;
			System.out.println("A");
		}
		System.out.println("C");
		catch(ArithmeticException e)
		{
			System.out.println("G");
		}
	}

}
