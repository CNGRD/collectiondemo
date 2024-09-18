package execution_process;

class Sample1 
{
	public void run()
	{
		System.out.println("Slowly start running");
		System.out.println("slowly stop running");
	}
	public void walk()
	{
		System.out.println("start walking");
		run();
		System.out.println("stop walking");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample1 s=new Sample1();
		s.walk();
		System.out.println("main ends");

	}

}
