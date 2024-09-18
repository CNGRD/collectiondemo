package methods;
import java.util.Scanner;
public class RevNu 
{
	public static int rev(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int res=rev(n);
		System.out.println("Reverse of number :"+res);
	}

}
