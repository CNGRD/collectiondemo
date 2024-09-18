package loops;
import java.util.Scanner;
public class EvenSum 
{
	public static void countEven(int n)
	{
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count++;
			}
			
			n=n/10;
		}
		System.out.println("Count of even digits :"+count);
	}
	public static void sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			
			n=n/10;
		}
		System.out.println("Summation of even digits in number "+sum);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		countEven(num);
		sum(num);
	}

}
