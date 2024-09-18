package recursion;

public class PrintEven 
{

	public static void main(String[] args) 
	{
		int num=20;int n=1;
		printEvenNum(num,n);

	}
	public static void printEvenNum(int num,int n)
	{
		if(num<n)
		{
			return;
		}
		if(n%2==0)
		{
			System.out.println(n);
			
		}
		printEvenNum(num,++n);
	}

}
