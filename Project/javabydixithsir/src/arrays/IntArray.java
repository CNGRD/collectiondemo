package arrays;
import java.util.Scanner;
public class IntArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the int array");
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements @ "+i);
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.print(arr[i]);
			if(i<arr.length-1) 
			{
				System.out.print(",");
			}
			else
				System.out.print("");
		}
	}

}
