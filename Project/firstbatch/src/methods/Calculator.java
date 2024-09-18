package methods;

public class Calculator 
{
	public static void add()
	{
		int n1=10;
		int n2=25;
		System.out.println("addition of "+n1+" and "+n2+" is "+(n1+n2));
	}
	public static void sub()
	{
		int n1=50;
		int n2=25;
		System.out.println("Subtraction of "+n1+" and "+n2+" is "+(n1-n2));
	}
	public static void mul()
	{
		int n1=4;
		int n2=5;
		System.out.println("Multiplication of "+n1+" and "+n2+" is "+(n1*n2));
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		add();
		sub();
		mul();
		System.out.println("main ends");
	}

}
