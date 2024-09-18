package questions_on_exception;

public class Q1 
{

	
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("A");
			int n=76/0;
			System.out.println("B");
		}
		catch(ArithmeticException rv)
		{
			System.out.println("c");
		}
		catch(Exception e)
		{
			System.out.println("D");
		}
		System.out.println("E");

	}

}
