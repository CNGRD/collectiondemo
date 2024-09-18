package array_programs;
import java.util.Scanner;
public class Program13 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Enter element @ index "+i);
			a1[i]=sc.nextInt();
		}
		int highest=a1[0];
		for(int i=1;i<a1.length;i++)
		{
			if(highest>a1[i])
			{
				highest=a1[i];
			}
		}
	}

}
