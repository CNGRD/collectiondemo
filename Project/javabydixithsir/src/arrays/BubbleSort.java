package arrays;
import java.util.Scanner;
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int[] m=new int[size];
		for(int i=0;i<m.length;i++)
		{
				System.out.println("Enter element @"+i);
				m[i]=s.nextInt();
		}
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		for(int i=0;i<m.length;i++)
		{
		System.out.print(m[i]);
			if(i<m.length-1)
			{	
				System.out.print(",");
			}
			else
			{
				System.out.print("");
			}
		}
		
	}

}
