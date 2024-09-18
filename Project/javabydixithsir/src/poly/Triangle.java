package poly;
import java.util.Scanner;
public class Triangle extends Shape
{
	Scanner s=new Scanner(System.in);
	public void area()
	{
		double a;
		System.out.println("Enter the Base");
		double l=s.nextDouble();
		System.out.println("Enter the Height");
		double w=s.nextDouble();
		a=0.5*l*w;
		System.out.println("Area of Triangle is :"+a);
		System.out.println("**************************");
		
	}

}
