//Waptc integer array with 5 elements and print only the even elements
package array_programs;
import java.util.Scanner;
public class Program8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] e1=new int[size];
		for(int i=0;i<=e1.length-1;i++)
		{
			System.out.println("Enter the array elements @ "+i);
			e1[i]=sc.nextInt();
		}
		for(int i=0;i<e1.length;i++)
		{
			if((e1[i]!=0)&&(e1[i]%2==0))
			{
				System.out.println("Even elements are "+e1[i]);
			}
		}
	}

}
