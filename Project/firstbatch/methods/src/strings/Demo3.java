package strings;
import java.util.Scanner;
class Demo3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		for (int i = str.length()-1; i>=0; i--) 
		{
			char c=str.charAt(i);
			System.out.print(c);
		}

	}

}
