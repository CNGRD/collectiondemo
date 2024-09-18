package methods;
import java.util.Scanner;
public class CountDigit 
{
	public static int iterate(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r=n%10;
			count++;
			n=n/10;
		}
		return count;
		
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		int res=iterate(n);
		System.out.println("Number of digits :"+res);
	}

}
