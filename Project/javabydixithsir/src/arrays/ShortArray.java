package arrays;
import java.util.Scanner;
public class ShortArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		short[] s=new short[size];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the element @:"+i);
			s[i]=sc.nextShort();
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+",");
		}

	}

}
