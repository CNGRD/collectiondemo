package poly;
import java.util.Scanner;
public class Circle extends Shape 
{
	Scanner s=new Scanner(System.in);
	public void area()
	{
		double a;
		System.out.println("Enter the Radius of Circle");
		double r=s.nextDouble();
		a=3.142*r*r;
		System.out.println("Area of Circle is :"+a);
		System.out.println("**************************");
	}

}
