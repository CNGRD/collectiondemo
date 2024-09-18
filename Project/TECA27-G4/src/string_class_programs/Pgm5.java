package string_class_programs;
import java.util.Scanner;
public class Pgm5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		char[] ch=new char[s1.length()];
		for(int i=0;i<=s1.length()-1;i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(ch[i]);
			
			
		}
	}

}
