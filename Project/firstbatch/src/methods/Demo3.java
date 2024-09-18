package methods;

public class Demo3 
{
	public void add(int a)
	{
		a=a+10;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo3 d=new Demo3();
		d.add(5);
		System.out.println("main ends");
	}

}
