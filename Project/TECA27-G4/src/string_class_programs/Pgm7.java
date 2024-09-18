package string_class_programs;
import java.util.Scanner;
public class Pgm7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next();
		char[] ch=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
