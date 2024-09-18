package arrays;
import java.util.Scanner;
public class DoubleArray1 
{

	public static void main(String[] args) 
	{
		double[] d=new double[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for (int i = 0; i < d.length; i++) 
		{
			d[i]=sc.nextDouble();
			System.out.println("entered element @ index :"+i+" is :"+d[i]);
		}
		System.out.println("Array elements are......");
		for (double e:d) 
		{
			System.out.print(e+",");
			
		}
		
	}

}
