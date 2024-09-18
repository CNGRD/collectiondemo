package exception_handling;

public class ThrowClass 
{
	public static void divide(int i,int j)
	{
		System.out.println(i/j);
	}
	public static void main(String[] args) 
	{
		try
		{
		divide(2,0);
		}
		catch(ArithmeticException rv)
		{
			System.out.println("Number can not be divided by zero");
		}
		}
	}

}
