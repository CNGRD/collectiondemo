package exception_handling;
import java.util.Scanner;
public class StringException 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println("Enter the index number from 0 to "+(s1.length()-1)+" to find character");
		int index=sc.nextInt();
		char ch;
		try
		{
		 ch=s1.charAt(index);
		 System.out.println("Program ends");
		}
		catch(StringIndexOutOfBoundsException rv)
		{
			System.out.println("Enter valid index number");
			index=sc.nextInt();
			ch=s1.charAt(index);
			System.out.println("Character found"+ch);
		}
		
	}

}
