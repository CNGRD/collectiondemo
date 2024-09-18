//Waptc a character array and print only the element which is z
package array_programs;
import java.util.Scanner;
public class Program9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		char[] c1=new char[size];
		for(int i=0;i<c1.length;i++)
		{
			System.out.println("Enter the array elements @ "+i);
			c1[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<c1.length;i++)
		{
			if((c1[i]=='Z')||(c1[i]=='z'))
			{
			System.out.println("Element searched that is "+c1[i]);
			}
			
		}
		System.out.println("element Z not present in array");
	}

}
