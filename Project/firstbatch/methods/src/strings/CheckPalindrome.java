package strings;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine() ;
		char ch ;
		
		String reverse ="" ;
		
		
		for( int i = str.length()-1 ; i>= 0 ; i--)
		{
			ch = str.charAt(i) ;
			reverse = reverse + ch ;			
		}
		
		if(str.equals(reverse))
			System.out.println("String is palindrome!");
		else
			System.out.println("String is not palindrome!");
	}

}
