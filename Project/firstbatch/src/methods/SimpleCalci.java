package methods;

public class SimpleCalci 
{
	public static void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println("Addition is :"+res);
	}
	public void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition is :"+res);
	}
	public static void add(double a,double b)
	{
		double res=a+b;
		System.out.println("Addition is :"+res);
	}
	public static void main(String[] args) 
	{
		SimpleCalci s=new SimpleCalci();
		add();
		s.add(5,15);
		add(3.7,8.6);

	}

}
