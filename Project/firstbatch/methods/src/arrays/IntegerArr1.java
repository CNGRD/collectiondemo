package arrays;
import java.util.*;

class IntegerArr1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Array elements...");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextInt();
			System.out.println("Element entered @ index :"+i+" is "+arr[i]);
		}
		System.out.println("Array elements are....");
		for (int i = arr.length-1; i >=0; i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
