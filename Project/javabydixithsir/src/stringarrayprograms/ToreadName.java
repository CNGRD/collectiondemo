package stringarrayprograms;
import java.util.Scanner;
public class ToreadName 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		char[] c1=new char[size];
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println("Enter the character @ index:"+i);
			c1[i]=sc.next().charAt(0);
		}
		System.out.println("Name is :");
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println(c1[i]);
		}
		System.out.println(c1);

	}

}
