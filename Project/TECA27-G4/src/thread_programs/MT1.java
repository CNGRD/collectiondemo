package thread_programs;

public class MT1 extends Thread
{
	public void myMethod()
	{

		System.out.println("Current thread id "+Thread.currentThread().getId());
	}
	@Overrided
	public void run()
	{
		myMethod();
	}
}
