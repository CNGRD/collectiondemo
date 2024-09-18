package arrays;
import java.util.Scanner;
public class AscSortArray 
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
			for(int i=m.length-1;i>=0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(m[i]>m[j])
					{
						int temp=m[j];
						m[j]=m[i];
						m[i]=temp;
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


