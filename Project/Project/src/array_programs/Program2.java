package array_programs;
import java.util.Scanner;
public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		double[] d=new double[size];
		for(int i=0;i<=d.length-1;i++)
		{
			System.out.println("Enter the array element @ index"+i);
			d[i]=sc.nextDouble();
		}
		System.out.println("Elements are....!!!");
		for(int i=0;i<=d.length-1;i++)
		{
		 System.out.println("Element present at index "+i+" is "+d[i]);
		}
		
	}

}
