package arrays;
import java.util.Scanner;
public class Program3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element @ index "+i);
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(" "+arr[i]+" ");
		
		}

	}

}
