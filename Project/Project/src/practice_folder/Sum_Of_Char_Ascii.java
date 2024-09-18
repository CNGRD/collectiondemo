package practice_folder;
import java.util.Scanner;
public class Sum_Of_Char_Ascii 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			sum=sum+ch;
		}
		System.out.println("ASCII number sum of all characters present in given String is :"+sum);
	}

}
