package exception_handling;

public class UnCheckedException 
{
	public static void display() throws InterruptedException
	{
		System.out.println("hi");
		Thread.sleep(5000);
		System.out.println("hello");
	}

	public static void main(String[] args) 
	{
		try
		{
		display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("exception handled");
		}
		
	}

}
