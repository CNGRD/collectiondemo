package methods;
import java.util.Scanner;
public class SumOfDigits 
{
	public static int  sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		int res=sum(n);
		System.out.println("Summation of disgits "+res);
	}

}
