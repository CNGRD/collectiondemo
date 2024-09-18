package arrays;
import java.util.Scanner;
public class MergeTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array1");
		int size1=s.nextInt();
		int[] arr1=new int[size1];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the elements @ "+i);
			arr1[i]=s.nextInt();
			
		}
		System.out.println("Enter the size of the array2");
		int size2=s.nextInt();
		int[] a2=new int[size2];
		for(int i=0;i<a2.length;i++)
		{
			System.out.println("Enter the elements @"+i);
			a2[i]=s.nextInt();
		}
		int[] arr3=new int[arr1.length+a2.length];
		int a3=0;
		for( int a2=0;a2<a2.length;a2++)
		{
			arr3[a3++]=arr2[a2];
			
		}
		for( int a1=0;a1<arr1.length;a1++)
		{
			arr3[a3++]=arr2[a1];
			
		}
		for(int i=0;i<arr3.length;i++)
		{
		 System.out.print(arr3[i]);
		 if(i<arr3.length-1)
		 {
			 System.out.print(",");
		 }
		 else
			 System.out.print("");
			
		}
		
	}

}
