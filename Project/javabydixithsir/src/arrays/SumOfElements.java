package arrays;
import java.util.Scanner;
public class SumOfElements 
{

		public static int sumOfElements(int[] b)
		{
			int sum=0;
			for(int i=0;i<b.length;i++)
			{
				sum=sum+b[i];
			}
			return sum;
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element @"+i);
			a[i]=sc.nextInt();
		}
		int res=sumOfElements(a);
		System.out.println("Summation of all "+res);
	}

}
