package pack1;
import java.util.Scanner;
public class Array1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		short arr[]=new short[size];
		
		for(int i=0;i<arr.length;i++)//
		{
			arr[i]=sc.nextShort();
			System.out.println("entered element @ "+i+" is "+arr[i]);
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i==arr.length-1)
			{
				break;
			}
			System.out.print(",");
		}
		
	}

}



















/*System.out.println("enter the array size");
int size=sc.nextInt();
double[] arr=new double[size];
System.out.println("enter the array elements");
for (int i = 0; i < arr.length; i++) 
{
	arr[i]=sc.nextDouble();
	System.out.println("entered element @ "+i+" is "+arr[i]);
}
for (int i = 0; i < arr.length; i++) 
{
	System.out.print(arr[i]);
	if (i==arr.length-1) 
	{
		break;
		//System.out.println(",");
	}
	System.out.print(",");*/
