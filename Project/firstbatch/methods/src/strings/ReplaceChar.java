package strings;
import java.util.Scanner;
class ReplaceChar 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=s.nextLine();
		System.out.println("Enter the Character");
		char ch=s.next().charAt(0);
		String str2=str1.replace(ch+"", ""
				);
		int count=str1.length()-str2.length();
		System.out.println(ch+" is repeated for "+count+" times");
	}

}
