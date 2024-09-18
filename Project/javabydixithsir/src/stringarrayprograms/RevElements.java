package stringarrayprograms;
import java.util.Scanner;
public class RevElements 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		char[] c1=new char[size];
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println("enter element @ index "+i);
			c1[i]=sc.next().charAt(0);
			
		}
		if
		for(int i=c1.length-1;i>=0;i--)
		{
			System.out.println("Reverse of the elements "+c1[i]);
		}
	}

}
