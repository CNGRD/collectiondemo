package array_programs;
import java.util.Scanner;
public class FindCharZ 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		char[] ch=new char[size];
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("enter the array elements @ index: "+i);
			ch[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]=='z')||(ch[i]=='Z'))
			{
				count++;
				System.out.println("Element "+ch[i]+"present at index :"+i);
			}
			/*else
			{
				System.out.println("element not found");
			}*/
		}
		if(count!=0)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
		
	}

}
