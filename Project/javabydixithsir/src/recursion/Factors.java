package recursion;

public class Factors 
{

	public static void main(String[] args) 
	{
		int num=12;
		factor(num,1);
	}
	public static void factor(int num,int n)
	{
		if(num<n)
		{
			return;
		}
		if(num%n==0&& num!=n)
		{
			System.out.println(n+" ");
		}
		factor(num,++n);
	}

}
