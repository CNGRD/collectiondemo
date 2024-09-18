package methods;
import java.util.Scanner;
public class Demo4 
{
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition of "+a+" and "+b+" is "+sum);
	}
	public static void sub(int a,int b)
	{
		int res=a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is "+res);
	}
	public static void mul(int a,int b)
	{
		int m=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+m);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int n1=sc.nextInt();
		System.out.println("Enter the number2");
		int n2=sc.nextInt();
		add(n1,n2);
		sub(n1,n2);
		mul(n1,n2);
		
		
	}

}
