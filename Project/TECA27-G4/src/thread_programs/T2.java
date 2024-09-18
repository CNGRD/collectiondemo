package thread_programs;

public class T2 implements Runnable
{
	public void walk()
	{
		System.out.println("Walk 10 kms/day");
	}
	//@Overrided
	public void run()
	{
		walk();
	}
}
