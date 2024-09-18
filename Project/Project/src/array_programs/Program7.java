//wap to create integer array with 5 elements and only even elements
package array_programs;
import java.util.Scanner;
public class Program7 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scan.nextInt();
		double[] d1 = new double[size];
		for(int i=0;i<d1.length;i++)
		{
			System.out.println("Enter element at index "+i);
			d1[i]=scan.nextDouble();
		}
		for(int i=0;i<d1.length;i++)
		{
			
			if((i!=0)&&(i%2==0))
			{
				System.out.println("Entered element at index "+i+" is "+d1[i]);
			}
		}
		
	}

}
