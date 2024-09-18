package thread_programs;

public class T1 extends Thread 
{
	public void test()
	{
		System.out.println("hi");
	}
	@Overrided
	public void run()
	{
		test();
	}
}
