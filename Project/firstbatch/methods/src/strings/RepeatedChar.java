package strings;
import java.util.Scanner;

public class RepeatedChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i = 0; i < a.length(); i++)
		{
			int c = 0;
			char z = a.charAt(i);
			int d = 0;
			while(d < a.length())
			{

				if(a.charAt(d) == z)
				{
					c++;
				}
				d++;
			}
			if (c>=2)
			{
				System.out.println("Repeated character " + z);
			}
		}
		

	}

}
