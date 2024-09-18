package stringarrayprograms;
import java.util.Scanner;
public class Program1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println("enter the array element for index:"+i);
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println("Elements are....");
			System.out.println("Elements present at index is "+i+" is "+a1[i]);
		}
		
		
	}

}
