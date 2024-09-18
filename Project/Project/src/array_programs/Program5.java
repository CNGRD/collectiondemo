//Wap to create String Array to read your family members name one by one
package array_programs;
import java.util.Scanner;
public class Program5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of members in Family");
		int numOfFamMembers=sc.nextInt();
		String[] family=new String[numOfFamMembers];
		for(int i=0;i<=family.length-1;i++)
		{
			System.out.println("Enter the member Name @ "+i);
			family[i]=sc.next();
		}
		System.out.println("******************************");
		System.out.println("My Family");
		for(int i=0;i<=family.length-1;i++)
		{
			System.out.println("*****************************");
			System.out.println(family[i]);
		}

	}

}
