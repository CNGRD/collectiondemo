package exception_handling;

public class CheckedException 
{
	public static void main(String[] args) 
	{
		System.out.println("hi");
		try
		{
		Thread.sleep(5000);//interruptedException
		}
		catch(InterruptedException e)
		{
			System.out.println("checked exception handled");
		}
		
		System.out.println("hello");

	}

}
