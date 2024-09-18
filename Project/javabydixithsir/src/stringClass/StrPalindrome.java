package stringClass;
import java.util.Scanner;
public class StrPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.next();
		String s2="";
		String s3=str;
		for (int i = str.length()-1; i>=0; i--) 
		{
			
			char a=str.charAt(i);
			s2= s2 + a;
		}
		System.out.println(s2);
		if(s2.equals(s3))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}

	}

}
