package string_class_programs;
import java.util.Scanner;
public class Pgm4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		System.out.println("Enter the character");
		char c1=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c2=s1.charAt(i);
			if(c1==c2)
			{
				System.out.println("given character "+c1+"found");
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("character not found");
		}
	}

}
