package string_class_programs;
import java.util.Scanner;
public class Pgm6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			sum+=ch;
		}
		System.out.println("The ASCII sum of given string characters :"+sum);
	}

}
