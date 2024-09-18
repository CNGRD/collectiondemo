package arrays;
import java.util.*;

class IntegerArr {

	public static void main(String[] args) 
	{
		int[] arr=new int[8];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array elements...");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextInt();
			System.out.println("Element entered @ index :"+i+" is "+arr[i]);
		}
		System.out.println("Array elements are....");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
