package string_class_programs;
import java.util.Scanner;
public class Pgm13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1=sc.nextLine();
		String[] sArr=s1.split(" ");
		for(int i=0;i<=sArr.length-1;i++)
		{
			reverse(sArr[i]);
		}
		
	}
	public static void reverse(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
		}
		System.out.println(" ");
	}

}
