//waptc an integer array and count number of odd elements present in an array
package array_programs;
import java.util.Scanner;
public class Program11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Enter the array element @ "+i);
			a1[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			if((a1[i]!=0)&&(a1[i]%2!=0))
			{
				count++;
			}
		}
		System.out.println("number of odd elements count is "+count);
	}

}
