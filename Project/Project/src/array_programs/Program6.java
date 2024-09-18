//Wapt read an integer array and print all the elements in reverse order
package array_programs;
import java.util.Scanner;
public class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		char[] c1=new char[size];
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println("Enter element @ index "+i);
			c1[i]=sc.next().charAt(0);
		}
		System.out.println("Entered String in reverse order");
		for (int i=c1.length-1;i>=0;i--)
		{
			System.out.print(c1[i]);
		}
	}

}
