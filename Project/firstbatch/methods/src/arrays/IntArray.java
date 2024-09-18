package arrays;
import java.util.*;
class IntArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		double[] arr=new double[6];
		System.out.println("Enter elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextDouble();
			System.out.println("Entered element @ index :"+i+" is "+arr[i]);
		}
		System.out.println("Even elements are...");
		for (int i = 0; i < arr.length; i++) 
		{
				System.out.println(arr[i]+" ");
		}
		
	}

}
