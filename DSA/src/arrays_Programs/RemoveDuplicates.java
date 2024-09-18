package arrays_Programs;
/**
 * 
 * @author Nithin
 *
 */
/*
 * Here we remove duplicate array elements from integer array
 */
import java.util.Scanner;
public class RemoveDuplicates 
{

	public int removeDuplicates(int[] nums)
	{
		if(nums.length==1)
		return 1;
		int size=1;
		for(int j=0,i=1;i<nums.length;i++)
		{
			if(nums[i]!=nums[i-1])
			{
				size++;
				j++;
				nums[j]=nums[i];
			}
		}
		return size;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] num= new int[size];
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the element @ index:"+i);
			int n=sc.nextInt();
			num[i]=n;
		}
		
		int n=new RemoveDuplicates().removeDuplicates(num);
		System.out.println("Number of Elements after removing duplicates are:"+n+" elements");

		System.out.println("Elements after removing duplicates!!!");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]+" ");
		}
		

	}

}
