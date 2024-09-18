package questions_on_exception;

public class Q3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("S");
			int num=88/0;
			System.out.println("L");
		}
		catch(ArithmeticException rv)
		{
			System.out.println("G");
			System.exit(-1);
		}
		catch(Exception e)
		{
			System.out.println("J");
		}
		System.out.println("o");
		
	}

}
