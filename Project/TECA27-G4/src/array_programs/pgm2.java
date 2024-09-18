package array_programs;
import java.util.Scanner;
public class pgm2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println("Enter the array element @ index:"+i);
			a1[i]=sc.nextInt();
		}
		System.out.println("array elements are ");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.print(" "+a1[i]);
		}
	
	
	}
	
	

}
