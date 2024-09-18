package stringClass;
import java.util.Scanner;
public class Uword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=s.nextLine();
		for (int i = 0; i < str.length(); i++) 
		{
			if ((i==0 && str.charAt(i)!=' ')||(str.charAt(i)!=' ')&&str.charAt(i-1)==' ') 
			{
				System.out.print((str.charAt(i)+"").toUpperCase());
			}
			else
			{
				System.out.print((str.charAt(i)+"").toLowerCase());
			}
			
		}
	}

}
