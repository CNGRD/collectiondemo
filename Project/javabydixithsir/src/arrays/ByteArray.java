package arrays;
import java.util.Scanner;
public class ByteArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Byte array :");
		int size=s.nextInt();
		byte[] b=new byte[size];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the elements @:"+i);
			b[i]=s.nextByte();
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
	}

}
