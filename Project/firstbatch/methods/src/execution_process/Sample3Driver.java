package execution_process;

class Sample3
{
	public static void run1()
	{
		System.out.println("run 5km");
	}
	public static void walk1()
	{
		System.out.println("walk fast");
	}
}

public class Sample3Driver {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample3.run1();
		Sample3.walk1();
		System.out.println("main ends");
	}

}
